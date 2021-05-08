import java.util.Scanner;

public class ArrayPractice {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i=0; i< myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int num){
        System.out.println("Enter " + num + " integer values. \n");
        int[] values = new int[num];

        for(int i=0; i< values.length; i++){
            values[i] = sc.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum/ array.length;
    }
}
