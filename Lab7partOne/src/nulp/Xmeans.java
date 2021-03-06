package nulp;

import com.github.lwhite1.tablesaw.api.CategoryColumn;
import com.github.lwhite1.tablesaw.api.FloatColumn;
import com.github.lwhite1.tablesaw.api.NumericColumn;
import com.github.lwhite1.tablesaw.api.Table;
import com.github.lwhite1.tablesaw.util.DoubleArrays;
import smile.clustering.XMeans;


public class Xmeans {

    private final XMeans model;

    private final NumericColumn[] inputColumns;


    public Xmeans(int maxK, NumericColumn... columns) {

        double[][] data = DoubleArrays.to2dArray(columns);
        this.model = new XMeans(data, maxK);
        this.inputColumns = columns;
    }

    public int predict(double[] x) {
        return model.predict(x);
    }

    public double[][] centroids() {
        return model.centroids();
    }

    public double distortion() {
        return model.distortion();
    }

    public int getClusterCount() {
        return model.getNumClusters();
    }

    public int[] getClusterLabels() {
        return model.getClusterLabel();
    }

    public int[] getClusterSizes() {
        return model.getClusterSize();
    }

    public Table labeledCentroids() {
        Table table = Table.create("Centroids");
        CategoryColumn labelColumn = CategoryColumn.create("Cluster");
        table.addColumn(labelColumn);

        for (int i = 0; i < inputColumns.length; i++) {
            FloatColumn centroid = FloatColumn.create(inputColumns[i].name());
            table.addColumn(centroid);
        }

        double[][] centroids = model.centroids();

        for (int i = 0; i < centroids.length; i++) {
            labelColumn.addCell(String.valueOf(i));
            double[] values = centroids[i];
            for (int k = 0; k < values.length; k++) {
                table.floatColumn(k + 1).add((float) values[k]);
            }
        }
        return table;
    }

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
    System.out.println(xmeans.toString());
  }
}