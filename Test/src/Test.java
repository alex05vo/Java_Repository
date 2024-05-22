import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.print("Введіть початкове число ядер N0: ");
        int n0 = scanner.nextInt();

        System.out.print("Введіть сталу радіоактивного розпаду λ: ");
        double lambda = scanner.nextDouble();

        System.out.print("Введіть період часу t: ");
        double t = scanner.nextDouble();

        // Розрахунок числа розпалихся ядер
        int n = (int) (n0 * (1 - Math.exp(-lambda * t)));

        // Виведення результату
        System.out.println("Число ядер що розпалися за час t: " + n);
    }
}
