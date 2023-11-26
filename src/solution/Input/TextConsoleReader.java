package solution.Input;

import solution.Text.TextSolution;

import java.util.Scanner;

public class TextConsoleReader {
    public static TextSolution readConsoleText(){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        return new TextSolution(input);
    }
}
