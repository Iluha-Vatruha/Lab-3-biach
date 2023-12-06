package solution;

import solution.Matrix.Matrix;
import solution.Text.Text;

import java.util.Scanner;

public class MainMenu {
    public static void call(){
        Scanner s = new Scanner(System.in);
        String option;

        while (true){
            System.out.println("Добро пожаловать! С чем хотите поработать сегодня?");
            System.out.println("1. Поработать с матрицей");
            System.out.println("2. Поработать с текстом");
            System.out.println("3. Выход");

            option = s.nextLine();
            switch (option){
                case "1": Matrix.handle(); break;
                case "2": Text.handle(); break;
                case "3": return;
                default: System.out.println("Ты дебил? Введи нормально!"); break;
            }
        }

    }
}
