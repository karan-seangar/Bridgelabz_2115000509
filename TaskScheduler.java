class Task {
    private TaskNode head;
    private TaskNode tail; 
    private int size;

    class TaskNode {
        int taskId;
        String taskName;
        int taskPriority;
        String dueDate;
        TaskNode next;

        public TaskNode(int taskId, String taskName, int taskPriority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.taskPriority = taskPriority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    public void addTaskAtFirst(int taskId, String taskName, int taskPriority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, taskPriority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head; 
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; 
        }
        size++;
    }

    public void addTaskAtLast(int taskId, String taskName, int taskPriority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, taskPriority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head; 
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; 
        }
        size++;
    }

    public void addTaskAtPosition(int taskId, String taskName, int taskPriority, String dueDate, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 0) {
            addTaskAtFirst(taskId, taskName, taskPriority, dueDate);
            return;
        }
        if (position == size) {
            addTaskAtLast(taskId, taskName, taskPriority, dueDate);
            return;
        }

        TaskNode newTask = new TaskNode(taskId, taskName, taskPriority, dueDate);
        TaskNode temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        size++;
    }

    public void deleteTaskAtFirst() {
        if (head == null) {
            System.out.println("No task to delete");
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head; 
        }
        size--;
    }

    public void deleteTaskAtLast() {
        if (head == null) {
            System.out.println("No task to delete");
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            TaskNode temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
        size--;
    }

    public void deleteTaskWithTaskID(int taskId) {
        if (head == null) {
            System.out.println("No task to delete");
            return;
        }

        if (head.taskId == taskId) { 
            deleteTaskAtFirst();
            return;
        }
        
        if (tail.taskId == taskId) { 
            deleteTaskAtLast();
        }

        TaskNode temp = head;
        TaskNode prev = null;

        while (temp.next != head) { 
            if (temp.taskId == taskId) {
                prev.next = temp.next;
                if (temp == tail) { 
                    tail = prev;
                }
                size--;
                return;
            }
            prev = temp;
            temp = temp.next;
        }

    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        int count = 0;

        while (count < size) {
            System.out.println("Task ID: " + temp.taskId);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Task Priority: " + temp.taskPriority);
            System.out.println("Due Date: " + temp.dueDate);
            System.out.println("---------------------------");
            temp = temp.next;
            count++;
        }
    }

    public void searchTaskByPriority(int taskPriority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        int count = 0;
        boolean found = false;

        while (count < size) {
            if (temp.taskPriority == taskPriority) {
                System.out.println("Task ID: " + temp.taskId);
                System.out.println("Task Name: " + temp.taskName);
                System.out.println("Task Priority: " + temp.taskPriority);
                System.out.println("Due Date: " + temp.dueDate);
                System.out.println("---------------------------");
                found = true;
            }
            temp = temp.next;
            count++;
        }

        if (!found) {
            System.out.println("No tasks found with priority " + taskPriority);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Task taskScheduler = new Task();

        taskScheduler.addTaskAtFirst(1, "Task 1", 1, "2021-01-01");
        taskScheduler.addTaskAtLast(2, "Task 2", 2, "2021-01-02");
        taskScheduler.addTaskAtPosition(3, "Task 3", 3, "2021-01-03", 1);
        System.out.println("Initial Task List:");
        taskScheduler.displayAllTasks();

        System.out.println("\nDeleting First Task...");
        taskScheduler.deleteTaskAtFirst();
        taskScheduler.displayAllTasks();

        System.out.println("\nDeleting Last Task...");
        taskScheduler.deleteTaskAtLast();
        taskScheduler.displayAllTasks();

        System.out.println("\nDeleting Task with ID 2...");
        taskScheduler.deleteTaskWithTaskID(2);
        taskScheduler.displayAllTasks();

        System.out.println("\nSearching for Task with Priority 3...");
        taskScheduler.searchTaskByPriority(3);
    }
}
