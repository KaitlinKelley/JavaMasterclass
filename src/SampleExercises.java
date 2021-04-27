public class SampleExercises {

    public static void main(String[] args) {
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        printDayOfTheWeek(3);
        printDayOfTheWeek(13);
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

    //Area Calculator====================================
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return Math.PI*radius*radius;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        return x*y;
    }

    //Minutes to Years to Days Calculator
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid value");
        }else{
            long years = minutes/525600;
            long remMin = minutes % 525600;
            long days = remMin/1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    };

    //Equality Printer
    public static void printEqual(int num1, int num2, int num3){
        if(num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
        }else if(num1 == num2 && num1 == num3){
            System.out.println("All numbers are equal");
        }else if(num1 != num2 && num1 != num3 && num2 != num3){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    };

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying = false;
        if(temperature >= 25 && temperature <= 35){
            isPlaying = true;
        }else if(summer && temperature >= 25 && temperature <= 45){
            isPlaying = true;
        }
        return isPlaying;
    };

    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }






}
