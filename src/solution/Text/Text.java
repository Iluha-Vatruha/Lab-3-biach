package solution.Text;

import solution.Enums.Input;
import solution.Enums.Output;
import solution.Input.ReadResult;
import solution.Input.TextConsoleReader;
import solution.Output.TextConsoleWriter;
import solution.Output.WriteResult;
import solution.TypeHandler;

public class Text {
    private static final String fileNameText = "text_file";

    public static void handle(){
        Input input = TypeHandler.inputType();
        Solution solution = SolutionTypeHandler.solutionType();
        Output output = TypeHandler.outputType();
        TextSolution bruh = new TextSolution();
        switch(input){
            case FILE: bruh = ReadResult.getToFile(fileNameText); break;
            case CONSOLE: bruh = TextConsoleReader.readConsoleText(); break;
            case DEFAULT: bruh = new TextSolution();break;
            case NONE: return;
        }
        switch(solution){
            case REPLACE_VOWELS: bruh.solutionText(); break;
            case NONE: return;
        }
        switch (output){
            case FILE: WriteResult.saveToFile(bruh, fileNameText); break;
            case CONSOLE: TextConsoleWriter.writeConsoleText(bruh);break;
            case NONE: return;
        }
    }
}
