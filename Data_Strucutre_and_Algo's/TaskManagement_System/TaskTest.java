

public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(101, "Complete Assignment", "Pending");
        list.addTask(102, "Submit Report", "Completed");
        list.addTask(103, "Attend Meeting", "Pending");

        System.out.println("\nAll Tasks");
        list.displayTasks();

        System.out.println("\nSearching Task");
        list.searchTask(102);

        System.out.println("\nDeleting Task");
        list.deleteTask(102);

        System.out.println("\nTasks After Deletion");
        list.displayTasks();

    }
}