import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Бажаєте виконати завдання Task_1_1? (y/n)");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("y")) {
                Task_1_1 task_1_1 = new Task_1_1();
                task_1_1.ForCycle();
                
                do {
                    System.out.println("Бажаєте виконати завдання Task_1_2? (y/n)");
                    userInput = scanner.nextLine();
        
                    if (userInput.equalsIgnoreCase("y")) {
                        Task_1_2 task_1_2 = new Task_1_2();
                        task_1_2.WhileCycle();

                        do {
                            System.out.println("Бажаєте виконати завдання Task_2? (y/n)");
                            userInput = scanner.nextLine();
                
                            if (userInput.equalsIgnoreCase("y")) {
                                Task_2 task_2 = new Task_2();
                                task_2.ForHoursCycle();

                                do {
                                    System.out.println("Бажаєте виконати завдання Task_3? (y/n)");
                                    userInput = scanner.nextLine();
                        
                                    if (userInput.equalsIgnoreCase("y")) {
                                        Task_3 task_3 = new Task_3();
                                        task_3.WhileHoursCycle();

                                        do {
                                            System.out.println("Бажаєте виконати завдання Task_4? (y/n)");
                                            userInput = scanner.nextLine();
                                
                                            if (userInput.equalsIgnoreCase("y")) {
                                                Task_4 task_4 = new Task_4();
                                                task_4.ForSecondsCycle();

                                                do {
                                                    System.out.println("Бажаєте виконати завдання Task_5_1? (y/n)");
                                                    userInput = scanner.nextLine();
                                        
                                                    if (userInput.equalsIgnoreCase("y")) {
                                                        Task_5_1 task_5_1 = new Task_5_1();
                                                        task_5_1.WhileTabulation();

                                                        do {
                                                            System.out.println("Бажаєте виконати завдання Task_5_2? (y/n)");
                                                            userInput = scanner.nextLine();
                                                
                                                            if (userInput.equalsIgnoreCase("y")) {
                                                                Task_5_2 task_5_2 = new Task_5_2();
                                                                task_5_2.ForTabulation();

                                                                System.out.println("Програма завершує роботу. Завдання закiнчились.");
                                                                break; 
                                                            } else if (userInput.equalsIgnoreCase("n")) {
                                                                System.out.println("Програма завершує роботу.");
                                                                break; 
                                                            } 
                                                        } while (true);
                                                        
                                                        break; 
                                                    } else if (userInput.equalsIgnoreCase("n")) {
                                                        System.out.println("Програма завершує роботу.");
                                                        break;
                                                    } else {
                                                        System.out.println("Неправильний ввiд. Введiть 'y' або 'n'.");
                                                    }
                                                } while (true);
                                                
                                                break; 
                                            } else if (userInput.equalsIgnoreCase("n")) {
                                                System.out.println("Програма завершує роботу.");
                                                break;
                                            } else {
                                                System.out.println("Неправильний ввiд. Введiть 'y' або 'n'.");
                                            }
                                        } while (true);
                                        
                                        break; 
                                    } else if (userInput.equalsIgnoreCase("n")) {
                                        System.out.println("Програма завершує роботу.");
                                        break;
                                    } else {
                                        System.out.println("Неправильний ввiд. Введiть 'y' або 'n'.");
                                    }
                                } while (true);
                                
                                break; 
                            } else if (userInput.equalsIgnoreCase("n")) {
                                System.out.println("Програма завершує роботу.");
                                break;
                            } else {
                                System.out.println("Неправильний ввiд. Введiть 'y' або 'n'.");
                            }
                        } while (true);
                        
                        break; 
                    } else if (userInput.equalsIgnoreCase("n")) {
                        System.out.println("Програма завершує роботу.");
                        break;
                    } else {
                        System.out.println("Неправильний ввiд. Введiть 'y' або 'n'.");
                    }
                } while (true);

                break; 
            } else if (userInput.equalsIgnoreCase("n")) {
                System.out.println("Програма завершує роботу.");
                break;
            } else {
                System.out.println("Неправильний ввiд. Введiть 'y' або 'n'.");
            }
        } while (true);
    }
}