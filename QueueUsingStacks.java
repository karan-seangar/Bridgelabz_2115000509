import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.isEmpty() ? -1 : s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
