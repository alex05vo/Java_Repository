public class Phone {
    String number;
    String model;
    int weight;

    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-7890", "IPhone");
        Phone ostapPhone = new Phone("987-654-3210", "Samsung Galaxy", 165 );
        System.out.println("The phone I found: " + phone1.model + ", its number: " + phone1.number + ", its weight: " + phone1.weight);

        ostapPhone.recieveCall("Ostap");
        System.out.println("task2.Phone number: " + ostapPhone.getNumber());
        recieveCall("Ostap", "987-654-3210");

        sendMessage("987-654-3210", "555-1234", "888-999-0000");
    }

    public Phone() {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public static void recieveCall(String callerName) {
        System.out.println("Calling... " + callerName);
    }

    public static void recieveCall(String callerName, String number) {
        System.out.println("\nCalling... " + callerName + " and his phone number is " + number);
    }

    public static void sendMessage(String... phoneNumbers) {
        System.out.println("Phone numbers to send a message:");

        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    public String getNumber() {
        return number;
    }
}
