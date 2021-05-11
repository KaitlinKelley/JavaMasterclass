import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner sc = new Scanner(System.in);

    public static int readInteger(){
        System.out.println("Please enter an integer:");
        return sc.nextInt();
    }

    public static int[] readElements(int num){
        System.out.println("Please enter " + num + " integers:");
        int[] array = new int[num];

        for(int i=0; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        //OR
//        for(int i=0; i< array.length; i++){
//            int number = sc.nextInt();
//            sc.nextLine();
//            array[i] = number;
//        }

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
        int count = readInteger();
        sc.nextLine();
        int[] myArray = readElements(count);
        System.out.println("Minimum value was: " + findMin(myArray));
    }
}
