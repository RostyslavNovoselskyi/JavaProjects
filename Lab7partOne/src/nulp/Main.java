package nulp;

import smile.clustering.XMeans;

import java.util.ArrayList;
import java.util.List;



public class Main {

  public static void main(String[] args) {


    double input[][] = {
      {-14, 6},
      {-12, 6},
      {-13, 3},
      {-14, 2},
      {-11,3},
      {2, -1},
      {3, -2},
      {4, -1},
      {5, 0},
      {3, -6},
      {-4, -8},
      {-4, -9},
      {-2, 10}
    };

    XMeans xmeans = new XMeans(input,3);

  KMeans kMeans = new KMeans();
    List<Point> points = new ArrayList<>();
    for (int i = 0; i < input.length; i++) {
        Point point = new Point(input[i][0],input[i][1]);
        points.add(point);
      }

  kMeans.init(points);
    kMeans.calculate();
  }
}
