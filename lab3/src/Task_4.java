public class Task_4 {

    public void ForSecondsCycle(){

        System.out.println("Task 4:\n");
        for (int hours = 0; hours <= 2; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                for (int seconds = 0; seconds < 60; seconds++) {
                    System.out.println(hours + " h " + minutes + " min " + seconds + " sec");
                }
            }
        }
    }
}