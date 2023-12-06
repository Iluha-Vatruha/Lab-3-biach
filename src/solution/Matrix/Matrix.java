package solution.Matrix;

import solution.Enums.Input;
import solution.Enums.Output;
import solution.Input.MatrixConsoleReader;
import solution.Input.ReadResult;
import solution.Output.MatrixConsoleWriter;
import solution.Output.WriteResult;
import solution.TypeHandler;


public class Matrix {
    private static final String fileNameMatrix = "file_matrix";

    public static void handle(){
        Input input = TypeHandler.inputType();
        if (input == Input.NONE) return;
        Solution solution = SolutionTypeHandler.solutionType();
        if (solution == Solution.NONE) return;
        Output output = TypeHandler.outputType();
        if (output == Output.NONE) return;

        MatrixSolution bruh = new MatrixSolution();
        switch(input){
            case FILE: bruh = ReadResult.getToFile(fileNameMatrix); break;
            case CONSOLE: bruh = MatrixConsoleReader.readMatrixConsole(); break;
            case DEFAULT: bruh = new MatrixSolution();break;
        }
        switch(solution){
            case GEOMETRIC_MULTIPLICATION: bruh.geoMult(); break;
            case MATRIX_POPULAR_VALUE: bruh.matrixPop(); break;
            case DIOGANALS_SUM:bruh.dioSum(); break;
        }
        switch (output){
            case FILE: WriteResult.saveToFile(bruh, fileNameMatrix); break;
            case CONSOLE: MatrixConsoleWriter.writeConsoleMatrix(bruh);break;
        }

    }
}
