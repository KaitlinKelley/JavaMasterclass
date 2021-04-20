public class Hello {

    public static void main(String[] args){

        int myVal = 10000;

        //remember, Integer is a Wrapper Class
        int myMin = Integer.MIN_VALUE;
        int myMax = Integer.MAX_VALUE;
//        System.out.println("Integer Min Value = " + myMin);
//        System.out.println("Integer Max Value = " + myMax);
//        //Line below results in an overflow
//        System.out.println("Busted max value = " + (myMax + 1));
//        //Line below results in an underflow
//        System.out.println("Busted min value = " + (myMin -1));

        byte b = 50;
        short s = 14000;
        int i = 17;
        long l = (50000 + (10*(b + s + i)));

        System.out.println(l);



    }
}

//Expression - a construct that adds up to a single value