import java.util.ArrayList;
import java.util.Scanner;

public class CustomToDoListApp {
    private ArrayList<String> customTodoList = new ArrayList<>();

    public void displayList() {
        if (customTodoList.isEmpty()) {
            System.out.println("Your custom to-do list is empty.");
        } else {
            System.out.println("Custom To-Do List:");
            for (int i = 0; i < customTodoList.size(); i++) {
                System.out.println((i + 1) + ". " + customTodoList.get(i));
            }
        }
    }

    public void addTask(String task) {
        if (!customTodoList.contains(task)) {
            customTodoList.add(task);
            System.out.println("Task added: " + task);
        } else {
            System.out.println("Task already exists in the list. Not added.");
        }
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= customTodoList.size()) {
            String removedTask = customTodoList.remove(taskIndex - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task index. Task not removed.");
        }
    }

    public static void main(String[] args) {
        CustomToDoListApp toDoList = new CustomToDoListApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Custom Task");
            System.out.println("2. Display Custom ToDo List");
            System.out.println("3. Remove Custom Task");
            System.out.println("4. Quit");
            System.out.println("------------------------------------------------");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("------------------------------------------------");
                    System.out.print("Enter the custom task to add: ");
                    String newTask = scanner.nextLine();
                    toDoList.addTask(newTask);
                    System.out.println("------------------------------------------------");
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    toDoList.displayList();
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    System.out.println("------------------------------------------------");
                    System.out.print("Enter the task index to remove: ");
                    int taskIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    toDoList.removeTask(taskIndex);
                    System.out.println("------------------------------------------------");
                    break;
                case 4:
                    System.out.println("------------------------------------------------");
                    System.out.println("Thank You Visit Again!!!");
                    System.out.println("------------------------------------------------");
                    break;
                default:
                    System.out.println("------------------------------------------------");
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("------------------------------------------------");
            }
        } while (choice != 4);

        scanner.close();
    }
}
