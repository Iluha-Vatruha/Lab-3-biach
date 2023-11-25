package solution;

import solution.Matrix.Matrix;
import solution.Text.Text;

import java.util.Scanner;

public class MainMenu {
    public static void call(){
        System.out.println("Добро пожаловать! С чем хотите поработать сегодня?");
        System.out.println("1. Поработать с матрицей");
        System.out.println("2. Поработать с текстом");
        System.out.println("3. Выход");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        boolean isExit = false;
        switch (option){
            case "1": Matrix.handle(); break;
            case "2": Text.handle(); break;
            case "3": isExit = true; break;
            default: System.out.println("Ты дебил? Введи нормально!"); break;
        }
        if (!isExit){
            MainMenu.call();
        }
    }
}
