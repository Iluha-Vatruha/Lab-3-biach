package solution.Text;

import solution.Enums.Input;
import solution.Enums.Output;
import solution.TypeHandler;

import java.util.Scanner;

public class SolutionTypeHandler {
    public static Solution solutionType() {
            System.out.println("Введите задачу:");
            System.out.println("1. Заменить гласные на знак '-'.");
            System.out.println("2.Назад");
            Scanner s = new Scanner(System.in);
            String option = s.nextLine();
            switch (option){
                case "1": return Solution.REPLACE_VOWELS;
                case "2": return Solution.NONE;
                default: System.out.println("Ты дебил? Введи нормально!"); break;
            }
            return SolutionTypeHandler.solutionType();
    }
}
