package HighMath;

public class Series {

    public static long nSum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum+=i;
        }
        return sum;
    }

    public static long factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*(factorial(n-1));
    }

    //0! = 1;
    public static long factorial2(int n){
        if(n == 0){
            return 1;
        }
        long result = 1;
        for(int i = 1; i<= n; i++){
            result *= i;
        }
        return result;
    }

    public static long fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long fib2(int n){
        if (n ==0){
            return 0;
        }else if (n ==1){
            return 1;
        }
        //Hard-code for 0 and 1, now we deal with 2
        long nMinus1 = 1;
        long nMinus2 = 0;
        long result = 0;
        for(int i = 1; i < n; i++){
            result = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
//        for(int i = 0; i <= 10; i++){
//            System.out.println(Series.nSum(i));
//        }

//        for(int i = 0; i <= 10; i++){
//            System.out.println(Series.factorial(i));
//        }

        for(int i = 0; i <= 10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
