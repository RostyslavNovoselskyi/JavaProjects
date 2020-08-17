package tzipart1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Trigram extends Application {
    final static String TH = "TH";
    final static String THE = "THE";
    final static String HE = "HE";
    final static String IN = "IN";
    final static String ED = "ED";
    final static String OF = "OF";
    final static String AND = "AND";
    final static String AN = "AN";
    final static String ION = "ION";
    final static String TIO = "TIO";
    final static String POF = " OF";
    final static String AS = "AS";
    final static String ND = "ND";
    final static String DE = "DE";
    final static String YPT = "YPT";

    public void start(Stage stage) {
        stage.setTitle("Частота повторень Триграм");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc =
                new BarChart<>(xAxis, yAxis);
        bc.setTitle("Кількість даних букв");
        xAxis.setLabel("Буква");
        yAxis.setLabel("Значення");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("посортовані");

        series1.getData().add(new XYChart.Data(TH, 49));
        series1.getData().add(new XYChart.Data(THE, 44));
        series1.getData().add(new XYChart.Data(HE, 41));
        series1.getData().add(new XYChart.Data(IN, 38));
        series1.getData().add(new XYChart.Data(ED, 36));
        series1.getData().add(new XYChart.Data(OF, 29));
        series1.getData().add(new XYChart.Data(AND, 29));
        series1.getData().add(new XYChart.Data(AN, 27));
        series1.getData().add(new XYChart.Data(ION, 27));
        series1.getData().add(new XYChart.Data(TIO, 25));
        series1.getData().add(new XYChart.Data(POF, 23));
        series1.getData().add(new XYChart.Data(AS, 23));
        series1.getData().add(new XYChart.Data(ND, 20));
        series1.getData().add(new XYChart.Data(DE, 19));
        series1.getData().add(new XYChart.Data(YPT, 18));





        Scene scene = new Scene(bc, 800, 600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
