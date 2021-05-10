import java.util.Scanner;

public class MinimumElementChallenge {

    public static int[] readIntegers(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter " + num + " integers:");
        int[] array = new int[num];

        for(int i=0; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myArray = readIntegers(5);
        System.out.println(findMin(myArray));
    }
}
