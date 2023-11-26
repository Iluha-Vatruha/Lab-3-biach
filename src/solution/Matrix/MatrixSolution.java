package solution.Matrix;

import java.io.Serializable;

public class MatrixSolution implements Serializable {
    private short[][] matrixElements;
    private int result;
    public MatrixSolution(){
        matrixElements = new short[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
    public MatrixSolution(short[][] matrix) {
        this.matrixElements = matrix;
    }

    protected void geoMult(){
        int n = 1;
        for (int i = 0; i < matrixElements.length; i++) {
            for (int j = 0; j < matrixElements[i].length; j++) {
                n *= matrixElements[i][j];
            }
        }
        n /= matrixElements.length * matrixElements.length;
        result = n;
    }
    protected void dioSum() {
        int n = matrixElements.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrixElements[i][i];
            sum += matrixElements[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            sum -= matrixElements[n / 2][n / 2];
        }
        result = sum;
    }

    public int getResult() {
        return result;
    }

    protected void matrixPop() {
        int[] array = new int[2 * 32768];
        for (int i = 0; i < matrixElements.length; i++) {
            for (int j = 0; j < matrixElements[i].length; j++) {
                array[matrixElements[i][j] + 32768] += 1;
            }
        }
        int max_value = 0;
        int max_count = 0;
        for (int i = 0; i < array.length; i++) {
            if (max_count < array[i]) {
                max_value = i - 32768;
                max_count = array[i];
            }
        }
        result = max_value;
    }
}
