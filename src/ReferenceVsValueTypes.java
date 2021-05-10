import java.util.Arrays;

public class ReferenceVsValueTypes {

    //Primitive types = value types
    //Arrays and Strings are Reference types

    public static void main(String[] args) {
        int myInt = 10;
        int anotherInt = myInt;

        System.out.println(myInt);
        System.out.println(anotherInt);

        anotherInt++;

        System.out.println(myInt);
        System.out.println(anotherInt);

        //myArray holds a reference/address to an array in memory, rather than the data itself
        int[] myArray = new int[5];

        //now we have 2 references to the SAME array in memory, haven't made a new one
        int[] anotherArray = myArray;

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));
        System.out.println(myArray);
        System.out.println(anotherArray);

        //This will change "both" arrays, since the 2 variables references the SAME object in memory
        anotherArray[0] = 1;

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));

        //de-referencing anotherArray, and now it points to a different object in memory
        anotherArray = new int[] {4,5,6,7,8};

        //This will also change the first value in "both" arrays
        modifyArray(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;

        //creating a new array, initializing it
        array = new int[]{1,2,3,4,5};
    }
}
