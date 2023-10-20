

public class TestStack {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(14);
        s.push(15);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}