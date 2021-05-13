import java.util.ArrayList;

public class AutoAndUnBoxing {

    //AUTOBOXING AND UNBOXING
    //Essentially, going back and forth between primitive types and their wrapper classes


    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i=0; i<=10; i++){
            //This line below is an example of Boxing or Autoboxing
//            intArrayList.add(Integer.valueOf(i));

            //Rewrite as:
            intArrayList.add(i);
        }

        for(int i=0; i<=10; i++){
            //This line below is an example of Unboxing
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());

            //Rewrite as:
            System.out.println(i + " --> " + intArrayList.get(i));

        }

        Integer myInt = 56; //Compiler does this behind the scenes: Integer.valueOf(56);

        ArrayList<Double> myDoubles = new ArrayList<>();

        for(double dbl = 0.0; dbl<=10.0; dbl+=0.5){
//            myDoubles.add(Double.valueOf(dbl));  //AUTOBOXING, compiler does this behind the scenes
            myDoubles.add(dbl);
        }

        for(int i=0; i<myDoubles.size(); i++){
//            double val = myDoubles.get(i). doubleValue(); //UNBOXING, compiler does this behind the scenes
            double val = myDoubles.get(i);
            System.out.println(i + " --> " + val);
        }

    }
}
