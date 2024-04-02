import java.util.ArrayList;

public class stack_02 {
    class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        //push O(1)
        //pop O(1)
        //peek O(1)

        stack_.Stack s = new stack_.Stack();
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
