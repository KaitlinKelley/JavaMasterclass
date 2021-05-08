import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
//        for (int i=0; i< myIntegers.length; i++) {
//            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));
        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(int num){
        System.out.println("Enter " + num + " integer values. \n");
        int[] values = new int[num];

        for(int i=0; i< values.length; i++){
            values[i] = sc.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for(int i:array){
            System.out.println(i);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum/ array.length;
    }

    public static int[] sortIntegers(int[] array){
        int[] sorted = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            //Summary: iterate through the array, comparing 2 values at a time. If the value in the right-hand slot is greater than the value in the left-hand slot, swap them. This will keep iterating over the entire array until it is in descending order (flag never gets reset to true)
            for(int i=0; i<sorted.length - 1; i++){  //[1, 3, 6, 2, 9]  [3, 1, 6, 2, 9]
                if(sorted[i] < sorted[i+1]){ //if 1 < 3                 if 1 < 6
                    temp = sorted[i];       // temp = 1                 temp = 1
                    sorted[i] = sorted[i + 1];  // [3, 3, 6, 2, 9]      [3, 6, 6, 2, 9]
                    sorted[i + 1] = temp;  //[3, 1, 6, 2, 9]            [3, 6, 1, 2, 9]
                    flag = true;  //set flag back to true so that the loop runs again
                }
                System.out.println(Arrays.toString(sorted));
            }
        }
        return sorted;
    }
}
