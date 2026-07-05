

public class TaskLinkedList {

    Task head = null;

    // Add Task
    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task Added Successfully.");
    }

    // Traverse Tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("No Tasks Found.");
            return;
        }

        Task temp = head;

        while (temp != null) {

            System.out.println("Task ID : " + temp.taskId);
            System.out.println("Task Name : " + temp.taskName);
            System.out.println("Status : " + temp.status);
            System.out.println("--------------------");

            temp = temp.next;
        }

    }

    // Search Task
    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {

                System.out.println("Task Found");
                System.out.println("Task Name : " + temp.taskName);
                System.out.println("Status : " + temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        if (head.taskId == id) {

            head = head.next;
            System.out.println("Task Deleted.");
            return;
        }

        Task temp = head;

        while (temp.next != null) {

            if (temp.next.taskId == id) {

                temp.next = temp.next.next;

                System.out.println("Task Deleted.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found.");
    }

}