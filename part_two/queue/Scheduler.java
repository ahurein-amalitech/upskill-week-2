package part_two.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
    private Queue<String> tasks;

    public Scheduler(){
        tasks = new LinkedList<>();
    }

    public void addTask(String task){
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public String removeCompletedTask(){
        if(this.tasks.isEmpty()){
            System.out.println("No task in queue");
            return null;
        }
        String task  = this.tasks.poll();
        System.out.println("Completed task: " + task);
        return task;
    }

    public void printTasks(){
        if(this.tasks.isEmpty()){
            System.out.println("No tasks");
            return;
        }
        System.out.println("*** Ongoing tasks ****");
        for(String task: this.tasks){
            System.out.println(task);
        }
    }
}
