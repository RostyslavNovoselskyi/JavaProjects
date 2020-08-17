package nulp;

import java.util.ArrayList;
import java.util.List;



public class Main {

  public static void main(String[] args) {


    double input[][] = {
//            {-4, 4},
//            {-3, 4},
//            {-3, 3},
//            {-2, 2},
//            {3, -1},
//            {4, -2},
//            {5, -2},
//            {6, -2},
//            {0, -5},
//            {3, -5},
//            {0, -8},
//            {3, -7},
//            {3, -8}


            //for lab8
            {-8, 0},
            {-7, 0},
            {-6, 0},
            {-5, 1},
            {-6, 1},
            {-1, 2},
            {-1, 1},
            {-1, 0},
            {-2, 0},
            {0, -4},
            {0, -5},
            {0, -6},
            {0, -7}
    };

    System.out.println("K - means algorithm : \n");
    System.out.println("Kn-306 Novoselskyi Rostyslav \n");

  KMeans kMeans = new KMeans();
    List<Point> points = new ArrayList<>();
    for (int i = 0; i < input.length; i++) {
        Point point = new Point(input[i][0],input[i][1]);
        points.add(point);
      }

  kMeans.init(points);
    kMeans.calculate();

    ScatterChartSample scatterChartSample = new ScatterChartSample();
    scatterChartSample.main(args);
  }
}
