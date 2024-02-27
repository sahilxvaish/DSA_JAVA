package recursion_questions;

public class StringInReverse_ {
    public static void printReverse(String str, int idx){
        if (idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String[] args) {

        //print a string in reverse
        String str= "sahil";
        printReverse(str, str.length()-1);
    }
}
