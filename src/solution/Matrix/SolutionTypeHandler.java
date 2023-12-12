package solution.Matrix;

import java.util.Scanner;

public class SolutionTypeHandler {
    public static Solution solutionType() {
        Scanner s = new Scanner(System.in);
        String option;
        while (true){
            System.out.println("Введите задачу:");
            System.out.println("1. Посчитать сумму диагоналей матрицы.");
            System.out.println("2. Посчитать среднее геометрическое значение элементов матрицы.");
            System.out.println("3. Определить наиболее часто встречающееся значение элементов матрицы.");
            System.out.println("4. Выход");

            option = s.nextLine();
            switch (option){
                case "1": return Solution.DIOGANALS_SUM;
                case "2": return Solution.GEOMETRIC_MULTIPLICATION;
                case "3": return Solution.MATRIX_POPULAR_VALUE;
                case "4": return Solution.NONE;
                default: System.out.println("Ты дебил? Введи нормально!"); break;
            }
        }
    }
}
