import java.util.Scanner;

class ProcessScheduler {
    private ProcessNode head;
    private ProcessNode tail;
    private int timeQuantum;
    private int size;

    class ProcessNode {
        int processId;
        int burstTime;
        int remainingTime;
        ProcessNode next;

        public ProcessNode(int processId, int burstTime) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.next = null;
        }
    }

    public ProcessScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        System.out.println("Round Robin Scheduler initialized with Time Quantum: " + timeQuantum);
    }

    public void addProcess(int processId, int burstTime) {
        ProcessNode newProcess = new ProcessNode(processId, burstTime);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
        size++;
        System.out.println("Process " + processId + " added with Burst Time: " + burstTime);
    }

    public void deleteProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to delete.");
            return;
        }

        ProcessNode current = head, prev = tail;
        do {
            if (current.processId == processId) {
                if (current == head) {
                    head = head.next;
                }
                if (current == tail) {
                    tail = prev;
                }
                prev.next = current.next;
                size--;

                if (size == 0) {
                    head = tail = null;
                }
                System.out.println("Process " + processId + " removed from the queue.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalTime = 0, completedProcesses = 0, totalWaitingTime = 0, totalTurnaroundTime = 0;
        ProcessNode current = head;

        System.out.println("Starting Round Robin Scheduling...");

        while (completedProcesses < size) {
            if (current.remainingTime > 0) {
                int executionTime = Math.min(current.remainingTime, timeQuantum);
                totalTime += executionTime;
                current.remainingTime -= executionTime;
                System.out.println("Executing Process " + current.processId + " for " + executionTime + " time units.");

                if (current.remainingTime == 0) {
                    completedProcesses++;
                    int turnaroundTime = totalTime;
                    int waitingTime = turnaroundTime - current.burstTime;
                    totalWaitingTime += waitingTime;
                    totalTurnaroundTime += turnaroundTime;
                    System.out.println("Process " + current.processId + " completed. Turnaround Time: " + turnaroundTime + ", Waiting Time: " + waitingTime);
                    deleteProcess(current.processId);
                }
            }
            current = current.next;
        }

        System.out.println("Scheduling Completed.");
        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / completedProcesses);
    }

    public void removeProcess(int processId){
        if(head == null){
            System.out.println("No processes to delete.");
            return;
        }
        ProcessNode current = head;
        while(current != null){
            if(current.processId == processId){
                if(current == head){
                    head = head.next;
                    tail.next = head;
                }
                else if(current == tail){
                    tail = tail.next;
                    tail.next = head;
                }
                else{
                    ProcessNode temp = head;
                    while(temp.next != current){
                        temp = temp.next;
                    }
                    temp.next = current.next;
                }
                size--;
                System.out.println("Process with ID " + processId + " removed successfully.");
                return;
            }
            current = current.next;
        }
    }

    public int getProcessCount(){
        return size;
    }

}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time Quantum: ");
        int timeQuantum = sc.nextInt();
        ProcessScheduler scheduler = new ProcessScheduler(timeQuantum);

        scheduler.addProcess(1, 10);
        scheduler.addProcess(2, 5);
        scheduler.addProcess(3, 8);

        System.out.println("Starting the scheduling process...");
        scheduler.simulateScheduling();
    }
}
