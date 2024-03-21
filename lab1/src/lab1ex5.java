

import java.util.Scanner;

public class lab1ex5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть рандомне трьохзначне число: ");
            int number = scanner.nextInt();

            if (number >= 100 && number <= 999) {
                int reversed = reverse(number);
                System.out.println("Ваше число: " + number);
                System.out.println("Реверснуте число: " + reversed);
            } else {
                System.out.println("Введене число не є трьохзначним.");
            }
        }
    }

    public static int reverse(int number) {
        int digit1 = number % 10;        
        int digit2 = (number / 10) % 10; 
        int digit3 = number / 100;       
        int reversed = digit1 * 100 + digit2 * 10 + digit3;
        return reversed;
    }
}
