package nulp;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ScatterChartSample extends Application{
    @Override public void start(Stage stage) {
        stage.setTitle("Scatter Chart Sample");
        final NumberAxis xAxis = new NumberAxis(-13, 10, 1);
        final NumberAxis yAxis = new NumberAxis(-13, 10, 1);
        final ScatterChart<Number,Number> sc = new
                ScatterChart<Number,Number>(xAxis,yAxis);
        xAxis.setLabel("Age (years)");
        yAxis.setLabel("Returns to date");
        sc.setTitle("Investment Overview");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Equities");
        series1.getData().add(new XYChart.Data(-11, 4));
        series1.getData().add(new XYChart.Data(-11, 2));
        series1.getData().add(new XYChart.Data(-11, 3));
        series1.getData().add(new XYChart.Data(3, 1));
        series1.getData().add(new XYChart.Data(4, 3));
        series1.getData().add(new XYChart.Data(5, 4));
        series1.getData().add(new XYChart.Data(5, 0));
        series1.getData().add(new XYChart.Data(3, -4));
        series1.getData().add(new XYChart.Data(4, -4));
        series1.getData().add(new XYChart.Data(5, -4));
        series1.getData().add(new XYChart.Data(4, -5));
        series1.getData().add(new XYChart.Data(6, -3));
//        series1.getData().add(new XYChart.Data(6, 5));




        sc.getData().addAll(series1);
        Scene scene  = new Scene(sc, 900, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
