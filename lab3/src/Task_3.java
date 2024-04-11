public class Task_3 {

    public void WhileHoursCycle(){
        
        int hour = 0;
        System.out.println("Task 3:\n");
        while (hour <= 2) {
            int minute = 0;
            while (minute < 60) {
                System.out.println(hour + " h " + minute + " min");
                minute++;
            }
            hour++;
        }
    }
}