package Methods;

public class Bus {
    public String model, colour;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D23Ha6";
    public final int SERIAL_NUMBER_1 = 2412;

    public void go(){
        System.out.println("Go");
    }

    public int showKm (){
        int km = 60;
        String str = "70km";
        return km;
    }

}
