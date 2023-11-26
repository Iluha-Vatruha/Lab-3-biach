package solution.Input;

import solution.Matrix.MatrixSolution;

import java.util.Scanner;

public class MatrixConsoleReader {
    public static MatrixSolution readMatrixConsole(){
        Scanner s = new Scanner(System.in);
        System.out.println("Укажите размерность матрицы.");
        int n = s.nextInt();
        short[][] input = new short[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matrix["+i+"]["+j+"]: ");
                input [i][j] = s.nextShort();
            }

        }
        return new MatrixSolution(input);
    }
}
