package solution.Output;

import solution.Text.TextSolution;

public class TextConsoleWriter {
    public static void writeConsoleText(TextSolution solution){
        System.out.println("Результат обработки текста:");
        System.out.println(solution.getResult());
    }
}
