public class SampleExercises {

    public static void main(String[] args) {
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
//        printDayOfTheWeek(3);
//        printDayOfTheWeek(13);

//        findPrimesInRange(200, 300);

//        int sum = 0;
//        int count = 0;
//
//        for(int i = 1; i <= 1000; i++){
//            if((i % 3 == 0) && (i % 5 == 0)){
//                count++;
//                sum+=i;
//                System.out.println(i);
//            }
//
//            if(count == 5){
//                break;
//            }
//        }
//
//        System.out.println("Sum: " + sum);

        int number = 4;
        int finishNumber = 20;
        int numOfEvens = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }else{
                numOfEvens++;
            }

            System.out.println("Even number: " + number);
            System.out.println("Current count of evens: " + numOfEvens);
            System.out.println("-------------------------------");

            if(numOfEvens >= 5){
                break;
            }
        }

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

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }

    //Number of Days in Month===================================
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        int days = 0;

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                if(isLeapYear(year)){
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
        }

        return days;
    }


    //Prime Numbers==================================================
    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void findPrimesInRange(int num1, int num2){

        int numOfPrimes = 0;

        for(int i=num1; i<=num2; i++){
            if(isPrime(i)){
                System.out.println(i);
                numOfPrimes++;
            }
        }

        System.out.println("Found  " + numOfPrimes + " prime numbers");

    }

    //Sum Odd===================================================

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        if(number % 2 == 0){
            return false;
        }else{
            return true;
        }
    }

    public static int sumOdd(int start, int end){
        if(start > end || start <= 0 || end <= 0){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }








}
