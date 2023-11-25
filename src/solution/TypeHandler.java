package solution;

import solution.Enums.Input;
import solution.Enums.Output;
import solution.Matrix.Matrix;
import solution.Text.Text;

import java.util.Scanner;

public class TypeHandler {
    public static Input inputType(){
        System.out.println("Введите тип ввода:");
        System.out.println("1. Файл.");
        System.out.println("2. Ввести через консоль.");
        System.out.println("3. Взять готовый набор.");
        System.out.println("4. Назад.");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch (option){
            case "1": return Input.FILE;
            case "2": return Input.CONSOLE;
            case "3": return Input.DEFAULT;
            case "4": return Input.NONE;
            default: System.out.println("Ты дебил? Введи нормально!"); break;
        }

        return TypeHandler.inputType();
    }

    public static Output outputType() {
        System.out.println("Введите тип вывода:");
        System.out.println("1. Файл.");
        System.out.println("2. Вывести через консоль.");
        System.out.println("3. Назад.");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch (option){
            case "1": return Output.FILE;
            case "2": return Output.CONSOLE;
            case "3": return Output.NONE;
            default: System.out.println("Ты дебил? Введи нормально!"); break;
        }
        return TypeHandler.outputType();
    }
}
