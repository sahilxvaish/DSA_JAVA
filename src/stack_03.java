import java.util.Stack;

public class stack_03 {
    public static void main(String[] args) {
        //push O(1)
        //pop O(1)
        //peek O(1)

        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
