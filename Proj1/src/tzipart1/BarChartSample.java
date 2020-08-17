package tzipart1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Scanner;

public class BarChartSample extends Application {
    final static String A = "A";
    final static String B = "B";
    final static String C = "C";
    final static String D = "D";
    final static String E = "E";
    final static String F = "F";
    final static String G = "G";
    final static String H = "H";
    final static String I = "I";
    final static String J = "J";
    final static String K = "K";
    final static String L = "L";
    final static String M = "M";
    final static String N = "N";
    final static String O = "O";
    final static String P = "P";
    final static String Q = "Q";
    final static String R = "R";
    final static String S = "S";
    final static String T = "T";
    final static String U = "U";
    final static String V = "V";
    final static String W = "W";
    final static String X = "X";
    final static String Y = "Y";
    final static String Z = "Z";
    final static String Prob = "_";
    final static String Apos = "`";
    final static String Proch = "-";
    final static String Kom = ",";
    final static String Krapka = ".";
    final static String Krakom = ";";


    @Override
    public void start(Stage stage) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s12 = scanner.nextLine();

                char[] text = s12.toCharArray();

                int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i1 = 0, j = 0
                        , k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s1 = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
                int probil = 0, apostr = 0, procherk = 0, koma = 0, krapka = 0, kk = 0;

                for (int i = 0; i < text.length; i++) {
                    char c1 = s12.charAt(i);
                    if (c1 == 'A') {
                        a++;
                    } else if (c1 == 'B') {
                        b++;
                    } else if (c1 == 'C') {
                        c++;
                    } else if (c1 == 'D') {
                        d++;
                    } else if (c1 == 'E') {
                        e++;
                    } else if (c1 == 'F') {
                        f++;
                    } else if (c1 == 'G') {
                        g++;
                    } else if (c1 == 'H') {
                        h++;
                    } else if (c1 == 'I') {
                        i1++;
                    } else if (c1 == 'J') {
                        j++;
                    } else if (c1 == 'K') {
                        k++;
                    } else if (c1 == 'L') {
                        l++;
                    } else if (c1 == 'M') {
                        m++;
                    } else if (c1 == 'N') {
                        n++;
                    } else if (c1 == 'O') {
                        o++;
                    } else if (c1 == 'P') {
                        p++;
                    } else if (c1 == 'Q') {
                        q++;
                    } else if (c1 == 'R') {
                        r++;
                    } else if (c1 == 'S') {
                        s1++;
                    } else if (c1 == 'T') {
                        t++;
                    } else if (c1 == 'U') {
                        u++;
                    } else if (c1 == 'V') {
                        v++;
                    } else if (c1 == 'W') {
                        w++;
                    } else if (c1 == 'X') {
                        x++;
                    } else if (c1 == 'Y') {
                        y++;
                    } else if (c1 == 'Z') {
                        z++;
                    } else if (c1 == ' ') {
                        probil++;
                    } else if (c1 == '`') {
                        apostr++;
                    } else if (c1 == '-') {
                        procherk++;
                    } else if (c1 == ',') {
                        koma++;
                    } else if (c1 == '.') {
                        krapka++;
                    } else if (c1 == ';') {
                        kk++;
                    }
                }

                stage.setTitle("Частота повторень біграм");
                final CategoryAxis xAxis = new CategoryAxis();
                final NumberAxis yAxis = new NumberAxis();
                final BarChart<String, Number> bc =
                        new BarChart<>(xAxis, yAxis);
                bc.setTitle("Кількість даних букв");
                xAxis.setLabel("Буква");
                yAxis.setLabel("Значення");

                XYChart.Series series1 = new XYChart.Series();
                series1.setName("не посортовані");

                series1.getData().add(new XYChart.Data(A, a));
                series1.getData().add(new XYChart.Data(B, b));
                series1.getData().add(new XYChart.Data(C, c));
                series1.getData().add(new XYChart.Data(D, d));
                series1.getData().add(new XYChart.Data(E, e));
                series1.getData().add(new XYChart.Data(F, f));
                series1.getData().add(new XYChart.Data(G, g));
                series1.getData().add(new XYChart.Data(H, h));
                series1.getData().add(new XYChart.Data(I, i1));
                series1.getData().add(new XYChart.Data(J, j));
                series1.getData().add(new XYChart.Data(K, k));
                series1.getData().add(new XYChart.Data(L, l));
                series1.getData().add(new XYChart.Data(M, m));
                series1.getData().add(new XYChart.Data(N, n));
                series1.getData().add(new XYChart.Data(O, o));
                series1.getData().add(new XYChart.Data(P, p));
                series1.getData().add(new XYChart.Data(Q, q));
                series1.getData().add(new XYChart.Data(R, r));
                series1.getData().add(new XYChart.Data(S, s1));
                series1.getData().add(new XYChart.Data(T, t));
                series1.getData().add(new XYChart.Data(U, u));
                series1.getData().add(new XYChart.Data(V, v));
                series1.getData().add(new XYChart.Data(W, w));
                series1.getData().add(new XYChart.Data(X, x));
                series1.getData().add(new XYChart.Data(Y, y));
                series1.getData().add(new XYChart.Data(Z, z));
                series1.getData().add(new XYChart.Data(Prob, probil));
                series1.getData().add(new XYChart.Data(Apos, apostr));
                series1.getData().add(new XYChart.Data(Proch, procherk));
                series1.getData().add(new XYChart.Data(Kom, koma));
                series1.getData().add(new XYChart.Data(Krapka, krapka));
                series1.getData().add(new XYChart.Data(Krakom, kk));

        System.out.println("A: "+ a + ") B: "+ b + ") C: " + c + ") D: " + d + ") E: " + e + ") F: " + f + ") G: "+g+")  H: "+h+") I: "+i1+") " +
                "J: "+j+") K: "+k+") L: "+l+") \n M: "+m+") N: "+n+") O: "+o+") P: "+p+") Q: "+q+") R: "+r+") S: "+s1+") T: "+t+") U: "+u+") " +
                "V: "+v+") W: "+w+") \n X: "+x+") Y: "+y+") Z: "+z+") _: "+probil+") `: "+apostr+") -: "+procherk+") ,: "+koma+") .: "+krapka+") ;: "+kk);

                Scene scene = new Scene(bc, 1000, 600);
                bc.getData().addAll(series1);
                stage.setScene(scene);
                stage.show();
            }

    public static void main(String[] args) {
        launch(args);
    }
}
