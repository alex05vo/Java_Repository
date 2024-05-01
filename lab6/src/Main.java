import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {

            System.out.println("Введiть номер завдання (1; 2; 3; 4; 5), або 'q' для виходу:");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("q")) {
                return;
            }

            switch (userInput) {
                case "1":
                    System.out.println("-------------------------------");
                    Person task1 = new Person("Mahmed", 38);
                    task1.talk();
                    task1.move();
                    break;
                case "2":
                    System.out.println("-------------------------------");
                    
                    Phone task2 = new Phone("067-116-9990", "Afon", 22222);
                    Phone MyPhone = new Phone("097-321-3135", "Sasung", 22222);
                    System.out.println("The phone I found: " + task2.model + ", its number: " + task2.number + ", its weight: " + task2.weight);

                    MyPhone.recieveCall("Abobus", "067-116-9990");
                    System.out.println("Phone number: " + MyPhone.getNumber());
                    
                    MyPhone.sendMessage("987-654-3210", "555-1234-3142", "999-999-9999");
                    break;
                // case "3":
                //     System.out.println("-------------------------------");
                //     Task_3 task3 = new Task_3();
                //     task3.ArrayOutput();
                //     break;
                // case "4":
                //     System.out.println("-------------------------------");
                //     Task_4 task4 = new Task_4();
                //     task4.ArrayMaxSize();
                //     break;
                // case "5":
                //     System.out.println("-------------------------------");
                //     Task_4 task4 = new Task_4();
                //     task4.ArrayMaxSize();
                //     break;
                default:
                    System.out.println("Неправильний ввiд. Введiть номер завдання (1; 2; 3; 4; 5) або 'q' для виходу.");
                    break;
            }
        }
    }
}