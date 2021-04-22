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

//        byte b = 50;
//        short s = 14000;
//        int i = 17;
//        long l = (50000 + (10*(b + s + i)));
//
//        System.out.println(l);

        //Ternary Operator Review===============================
//        boolean isCar = false;
//
//        boolean wasCar = isCar ? true : false;
//        isCar = true;
//        if (wasCar){
//            System.out.println("wasCar is true");
//        }
//
//        int ageOfClient = 20;
//        //if ageOfClient is 20, then assign true to isEighteenOrOver, otherwise assign false
//        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;

        //Operator Challenge===================================

        double myDouble = 20.00;
        double myOtherDouble = 80.00;

        double myThirdDouble = (myDouble + myOtherDouble) * 100.00;

        double myFourthDouble = myThirdDouble % 40.00;

        boolean stepFive = (myFourthDouble == 0) ? true : false;

        System.out.println(stepFive);

        if(!stepFive){
            System.out.println("Got some remainder.");
        }



    }
}

//Expression - a construct that adds up to a single value