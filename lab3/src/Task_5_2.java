import java.util.Scanner;

public class Task_5_2 {
    
    public void ForTabulation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введiть початок дiапазону: ");
        double start = scanner.nextDouble();
        System.out.println("Введiть кiнець дiапазону: ");
        double end = scanner.nextDouble();
        
        int count = 0;

        for (double x = 1.0; x <= 3.0; x += 0.1) {
            double result = x - 2 + Math.sin(1 / x);
            if (result >= start && result <= end) {
                count++;
                System.out.println("f(" + x + ") = " + result + " знаходиться в дiапазонi.");
            }
        }

        if (count == 0) {
            System.out.println("Значень функцiї в заданому дiапазонi не знайдено.");
        } else {
            System.out.println("У заданому дiапазонi знайдено " + count + " значень функцiї.");
        }
    }
}