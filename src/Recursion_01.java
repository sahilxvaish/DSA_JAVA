public class Recursion_01 {
//    public static void printSum(int i , int n , int sum){
//        if (i ==n) {
//            sum += i;
//            System.out.println(sum);
//            return;
//
//        }
//        sum +=i;
//        printSum(i+1, n, sum);
//        System.out.println(i);
//        }
//        System.out.println(n);
//        printNumb(n+1);
//    }
//    public static int calcfactorial(int n){
//        if (n == 1 || n == 0){
//            return 1;
//        }
//        int fact_nm1 = calcfactorial(n-1);
//        int fact_n = n* fact_nm1;
//        return fact_n;
//    }

//    public static void printFib(int a, int b, int n){
//        if(n == 0) {
//        return;
//        }
//
//        int c = a+b;
//        System.out.println(c);
//        printFib(b, c, n=1);
//    }

//    public static int calcPower(int x, int n){
//        if (n==0){   //base case1
//            return 1;
//        }
//        if (x==0){   //base case2
//            return 0;
//        }
//        int xPownm1  = calcPower(x, n-1);  //kaam
//        int xPown = x * xPownm1;
//        return xPown;
//    }

    public static int calcPower(int x, int n) {
        if (n == 0) {   //base case1
            return 1;
        }
        if (x == 0) {   //base case2
            return 0;
        }
        if (n % 2 == 0) {

            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

        public static void main (String[]args){
            //prerequisites
            //Iteration/loops
            //Functions
            //A function that call itself is called recursion.

            //print numbers from 5 to 1.
//        printSum(1, 5, 0);

            //factorial of number n.


//        int n = 5;
//        int ans = calcfactorial(n);
//        System.out.println(ans);

            //fibonacci sequence till nth term.
            //  int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printFib( a, b, n);

            //print x^n (stack height = n)

//        int x =2, n=5;
//        int ans = calcPower(x, n);
//        System.out.println(ans);


            //print x^n (stack height = log n)
            int x =2, n=5;
            int ans = calcPower(x, n);
            System.out.println(ans);

        }
    }

