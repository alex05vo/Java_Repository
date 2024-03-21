

public class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        User user1 = new User(1, 18, "Олександр", "Воронцов", 60, 175.5);
        User user2 = new User(2, 19, "Рамон", "Куць", 65.0, 176.4);
        User user3 = new User(3, 19, "Дмитро", "Окунь", 73.1, 183.0);
        User user4 = new User(4, 16, "Макс", "Рижий", 80.7, 175.0);
        User user5 = new User(5, 19, "Стас", "Косило", 72.0, 185.0);
        User user6 = new User(6, 18, "Iмператор", "Коломиї", 75.0, 177.0);
        User user7 = new User(7, 17, "Остяпко", "Протеїн", 100.5, 165.0);
        User user8 = new User(8, 15, "Вова", "Трейдер", 300.3, 150.0);
        User user9 = new User(9, 25, "Вiталя", "Бiмба", 110.2, 180);
        User user10 = new User(10, 19, "Пирiжечок", "Львiвський", 68, 172);

        int sumvik = user1.age + user2.age + user3.age + user4.age + user5.age +
                user6.age + user7.age + user8.age + user9.age + user10.age;
        System.out.println("Сума вiку: " + sumvik);

        double sumvag = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight +
                user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
        System.out.println("Сума ваги: " + sumvag);

        double sumzrist = user1.height + user2.height + user3.height + user4.height + user5.height +
                user6.height + user7.height + user8.height + user9.height + user10.height;
        System.out.println("Сума зросту: " + sumzrist);
    }
}
