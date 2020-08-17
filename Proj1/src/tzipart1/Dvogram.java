package tzipart1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Dvogram extends Application {
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
    final static String AS = " S";
    final static String S = "S";
    final static String T = "T";
    final static String AT = " T";
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
    final static String TH = "TH";
    final static String AN = "AN";
    final static String IN = "IN";
    final static String HE = "HE";
    final static String ES = "ES";

    public void start(Stage stage) {
        stage.setTitle("Частота повторень Двограм");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc =
                new BarChart<>(xAxis, yAxis);
        bc.setTitle("Кількість даних букв");
        xAxis.setLabel("Буква");
        yAxis.setLabel("Значення");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("не посортовані");

        series1.getData().add(new XYChart.Data(E, 168));
        series1.getData().add(new XYChart.Data(A, 164));
        series1.getData().add(new XYChart.Data(AS, 88));
        series1.getData().add(new XYChart.Data(AT, 75));
        series1.getData().add(new XYChart.Data(D, 68));
        series1.getData().add(new XYChart.Data(TH, 58));
        series1.getData().add(new XYChart.Data(AN, 53));
        series1.getData().add(new XYChart.Data(IN, 49));
        series1.getData().add(new XYChart.Data(S, 47));
        series1.getData().add(new XYChart.Data(HE, 47));
        series1.getData().add(new XYChart.Data(N, 44));
        series1.getData().add(new XYChart.Data(I, 42));
        series1.getData().add(new XYChart.Data(Krapka, 39));
        series1.getData().add(new XYChart.Data(ES, 37));
        series1.getData().add(new XYChart.Data(T, 35));



        Scene scene = new Scene(bc, 800, 600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
