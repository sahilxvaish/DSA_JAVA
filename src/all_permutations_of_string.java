public class all_permutations_of_string {
    public static void printPrem(String str, String permutation){
        if (str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0, 1)+ str.substring(i+1);
            printPrem(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPrem(str, "");

    }
}
