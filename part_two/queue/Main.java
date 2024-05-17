package part_two.queue;

public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();

        scheduler.addTask("Complete lab 2");
        scheduler.addTask("Move to 3 if more time");
        scheduler.addTask("Repeat");

        scheduler.printTasks();

        scheduler.removeCompletedTask();

        scheduler.printTasks();
    }
}
