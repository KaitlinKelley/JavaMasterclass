public class SampleExercises {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    //Speed Converter==============================================
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour/1.609);
        }
    };

    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if(result == -1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    };

    //MegaBytes Converter=======================================

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes/1024;
            int remKb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKb + " KB");
        }
    }

    //Barking Dog===============================================

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(hourOfDay < 0 || hourOfDay > 23 || !barking){
            return false;
        }else if(hourOfDay >= 8 && hourOfDay <= 22){
            return false;
        }
        return true;

    };

    //Leap Year Calculator==============================
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }else if(year % 4 != 0){
            return false;
        }else if(year % 100 != 0){
            return true;
        }else if(year % 400 == 0){
            return true;
        }else{
            return false;
        }
    };

    //Decimal Comparator================================
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int int1 = (int) (num1 * 1000);
        int int2 = (int) (num2 * 1000);

        return int1 == int2;
    };

    //Equal Sum Checker===============================
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return num1 + num2 == num3;
    };

    //Teen Number Checker==============================
    public static boolean hasTeen(int num1, int num2, int num3){
        if((isTeen(num1)) || (isTeen(num2)) || (isTeen(num3))){
            return true;
        }else{
            return false;
        }
    };

    public static boolean isTeen(int num1){
        return ((num1 >= 13) && (num1 <= 19));
    };






}
