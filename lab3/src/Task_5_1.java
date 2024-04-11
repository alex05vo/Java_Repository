import java.util.Scanner;

public class Task_5_1 {

    public void WhileTabulation(){

    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введiть початок дiапазону: ");
        double start = scanner.nextDouble();
        
        System.out.println("Введiть кiнець дiапазону: ");
        double end = scanner.nextDouble();
        
        double x = 1.0;
        int count = 0;
        
        while (x <= 3.0) {
            double result = x - 2 + Math.sin(1 / x);
            if (result >= start && result <= end) {
                count++;
                System.out.println("f(" + x + ") = " + result + " знаходиться в дiапазонi.");
            }
            x += 0.1;
        }
        
        if (count > 0) {
            System.out.println("Кiлькiсть значень функцiї в дiапазонi: " + count);
        } else {
            System.out.println("Значень функцiї в заданому дiапазонi немає.");
        }
    }
}