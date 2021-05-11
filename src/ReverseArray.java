import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int[] reversed = new int[array.length];
        int start = 0;
        for(int i=array.length-1; i >= 0; i--){
            reversed[start] = array[i];
            start++;
        }

        System.out.println("Reversed array = " + Arrays.toString(reversed));
    }

    public static void alternateReverseSolution(int[] array){

        int maxIndex = array.length - 1;  //4
        int halfLength = array.length / 2; //2

        for(int i=0; i < halfLength; i++){   //[1,2,3,4,5]
            int temp = array[i];            //1
            array[i] = array[maxIndex - i];  //[5,2,3,4,5]
            array[maxIndex - i] = temp;     //[5,2,3,4,1]
        }
        System.out.println(Arrays.toString(array));
    }




    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] otherArray = {2,3,4,5,6};
        reverse(array);
        alternateReverseSolution(otherArray);
    }
}
