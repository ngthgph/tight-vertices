import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> s;

    Stack() {
        s = new LinkedList<Integer>();
    }

    boolean isEmpty() {
        return(s.isEmpty());
    }

    int peek() {
        return s.peek();
    }

    void push(int x) {
        s.push(x);
    }

    int pop() {
        return s.pop();
    }
}
