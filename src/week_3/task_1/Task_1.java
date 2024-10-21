package week_3.task_1;

import java.util.ArrayList;
import java.util.Collections;

public class Task_1{
    public static void main(String[] args) {
        // Create an ArrayList to hold TaskItem objects
        ArrayList<TaskItem> tasks = new ArrayList<>();

        // Add TaskItem objects to the list
        Collections.addAll(tasks,
                new TaskItem(1,"Push lab code to GitHub", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED)
        );

        // Call methods to display tasks
        getAllObjects(tasks);
        getByStatus(tasks, Status.TO_DO);
        getById(tasks);
        getDescription(tasks);
    }

    // Method to print all TaskItem objects
    public static void getAllObjects(ArrayList<TaskItem> tasks) {
        for (TaskItem task : tasks) {
            task.printInformation();
        }
    }

    // Method to filter and print tasks by status
    public static void getByStatus(ArrayList<TaskItem> tasks, Status status) {
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == status) {
                task.printInformation();
            }
        }
    }
    // Method to print tasks with ID greater than or equal to 2
    public static void getById(ArrayList<TaskItem> tasks) {
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= 2) {
                task.printInformation();
            }
        }
    }

    // Method to print descriptions of all tasks
    public static void getDescription(ArrayList<TaskItem> tasks) {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }
}

// Define an enum to represent task statuses
enum Status {
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
}

// Define the TaskItem class
class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    // Constructor to initialize TaskItem
    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    // Method to print task information
    public void printInformation() {
        System.out.println(
                "ID: " + taskId +
                        " Task Description: " + taskDescription +
                        " Task Status: " + taskStatus
        );
    }

    // Getter for taskId
    public int getTaskId() {
        return taskId;
    }

    // Getter for taskDescription
    public String getTaskDescription() {
        return taskDescription;
    }

    // Getter for taskStatus
    public Status getTaskStatus() {
        return taskStatus;
    }
}