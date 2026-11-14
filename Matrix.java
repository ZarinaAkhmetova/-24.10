package base;

public class Matrix {
    private int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public int rows() {
        return data.length;
    }

    public int cols() {
        return data[0].length;
    }

    public int[][] transpose() {
        int[][] newData = new int[cols()][rows()];
        for (int i = 0; i < rows(); i++){
            for (int j = 0; j < cols(); j++){
                newData[j][i] = data[i][j];
            }
        }
        return newData;
    }

    public boolean isSquare() {
        return (cols() == rows());
    }
    // Сумма главной диагонали

    public int sumMainDiagonal() {
        int sum = 0;
        for (int i = 0; i < rows(); i++){
            sum += data[i][i];
        }
        return sum;
    }

    public void print() {
        for (int i = 0; i < rows(); i++){
            for (int j = 0; j < cols(); j++){
                System.out.printf("%5d", data[i][j]);
            }
            System.out.println();
        }
    }

}
