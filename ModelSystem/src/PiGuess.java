import java.util.Arrays;
import java.util.Random;

public class PiGuess {

    private static final ThreadLocal<Random> LOCAL_RANDOM = new ThreadLocal<Random>() {
        protected Random initialValue() {
            return new Random();
        };
    };

    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();


    private static final long[] apportion(final long samples) {
        int core = CPU_COUNT;
        final long[] portions = new long[core];
        long remaining = samples;

        while (core > 0) {
            final long part = (remaining - 1 + core) / core;
            core--;
            portions[core] = part;
            remaining -= part;
        }
        return portions;
    }


    public static final double sampleCircleArea(final long samples) {

        // how many samples to process in each thread.
        long[] counts = apportion(samples);

        // add up how many samples appear in the circle
        long inside = Arrays.stream(counts).parallel().map(s -> samplePortion(s)).sum();

        // convert the quadrant area back to the circle area.
        return (4.0 * inside) / samples;
    }


    private static final long samplePortion(final long samples) {
        final Random rand = LOCAL_RANDOM.get();
        long inside = 0;
        for (int i = 0; i < samples; i++) {
            if (isInside(rand)) {
                inside++;
            }
        }
        return inside;
    }


    private static final boolean isInside(final Random rand) {
        final double x = rand.nextDouble();
        final double y = rand.nextDouble();
        return x * x + y * y <= 1.0;
    }


    public static void main(String[] args) {
        double[] calculations = new double[100];
        for (int i = 0; i < calculations.length; i++) {
            double calc = sampleCircleArea(100000);
            calculations[i] = calc;
            System.out.printf("Loop %d guesses Pi at %.5f%n", i, calc);
        }
        System.out.printf("Overall calculation is %.5f%n", Arrays.stream(calculations).average().getAsDouble());
    }

}