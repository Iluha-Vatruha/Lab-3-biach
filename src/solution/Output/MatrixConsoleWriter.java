package solution.Output;

import solution.Matrix.MatrixSolution;

public class MatrixConsoleWriter {
    public static void writeConsoleMatrix (MatrixSolution solution){
        System.out.println("Результат выполнения задания:");
        System.out.println(solution.getResult());
    }
}
