public class SampleExercises {

    public static void main(String[] args) {


//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(1234));
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(123412));

//        System.out.println(reverse(-2));
//        numberToWords(0);
//        numberToWords(-100);

//        System.out.println(canPack(2,2,12));

        System.out.println(getLargestPrime(217));




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

    //Digit Sum
    public static int sumDigits(int num){
        if(num <= 9){
            return -1;
        }

        int sum = 0;

        while(num > 0){
            //extract the least significant digit
            //repeatedly add the least significant digit to the sum
            int digit = num % 10;
            sum += digit;
            //divide the num by 10 to then drop the least significant digit
            num /= 10;
        }
        return sum;
    }

    //Palindrome Checker
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }

        int revNum = 0;
        int origNum = number;

        while(number > 0){
            int digit = number % 10;
            revNum += digit;
            revNum *= 10;
            number /= 10;

            if(number < 10){
                revNum += number;
                break;
            }
        }

        return (origNum == revNum);
    }

    //First and Last Digit Sum
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;

        while(number >= 10){
            number /= 10;
        }

        int firstDigit = number;

        return lastDigit + firstDigit;
    }

    //Even Digit Sum
    public static int getEvenDigitSum(int num){
        if(num < 0){
            return -1;
        }

        int sum = 0;

        while(num > 0){
            int digit = num % 10;

            if(digit % 2 == 0){
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }

    //Shared Digit
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int lastDigNum1 = num1 % 10;
        int firstDigNum1 = num1 / 10;

        int lastDigNum2 = num2 % 10;
        int firstDigNum2 = num2 / 10;

        return firstDigNum1 == firstDigNum2
                || firstDigNum1 == lastDigNum2
                || lastDigNum1 == firstDigNum2
                || lastDigNum1 == lastDigNum2;
    }

    //Last Digit Checker
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }

        int lastDigNum1 = num1 % 10;
        int lastDigNum2 = num2 % 10;
        int lastDigNum3 = num3 % 10;

        return lastDigNum1 == lastDigNum2
                || lastDigNum1 == lastDigNum3
                || lastDigNum2 == lastDigNum3;
    }

    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }

    //Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int gcd = 1;
        int smallerNum;
        if(first < second){
            smallerNum = first;
        }else{
            smallerNum = second;
        }

        for(int i = 1; i <= smallerNum; i++){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;

        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }

    //Number to Words====================================
    public static void numberToWords(int number){

        if(number >= 0 && number <= 9){
            switch(number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        int newNum = reverse(number);
        int origDigCount = getDigitCount(number);
        int newDigCount = getDigitCount(newNum);

        while(newNum > 0){
            int digit = newNum % 10;
            switch(digit){
                case 0:
                    System.out.println("Zero");
                    newNum/=10;
                    break;
                case 1:
                    System.out.println("One");
                    newNum/=10;
                    break;
                case 2:
                    System.out.println("Two");
                    newNum/=10;
                    break;
                case 3:
                    System.out.println("Three");
                    newNum/=10;
                    break;
                case 4:
                    System.out.println("Four");
                    newNum/=10;
                    break;
                case 5:
                    System.out.println("Five");
                    newNum/=10;
                    break;
                case 6:
                    System.out.println("Six");
                    newNum/=10;
                    break;
                case 7:
                    System.out.println("Seven");
                    newNum/=10;
                    break;
                case 8:
                    System.out.println("Eight");
                    newNum/=10;
                    break;
                case 9:
                    System.out.println("Nine");
                    newNum/=10;
                    break;
            }
        }

        if(origDigCount != newDigCount){
            int digDiff = origDigCount - newDigCount;
            for(int i = 1; i <= digDiff; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){

        if (number >= -9 && number <= 9) {
            return number;
        }else {

            int origNum = number;

            if (number < 0) {
                number *= -1;
            }

            int revNum = 0;

            while (number > 0) {
                int digit = number % 10;
                revNum += digit;
                revNum *= 10;
                number /= 10;

                if (number < 10) {
                    revNum += number;
                    break;
                }
            }
            if (origNum < 0) {
                return revNum * -1;
            } else {
                return revNum;
            }
        }
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int count = 0;

        do{
            count++;
            number /= 10;
        } while(number > 0);

        return count;
    }

    //Flour Pack Problem

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int possibleKilos = bigCount*5 + smallCount;

        if(goal > possibleKilos){
            return false;
        }
        if(goal == possibleKilos){
            return true;
        }

        if(bigCount == 0 && smallCount >= goal){
            return true;
        }else{

        }


        if((bigCount * 5) % goal != smallCount){
            return false;
        }

        return true;
    }

    //Largest Prime
    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }

        int maxPrime = 2;
        while(number > maxPrime){
            if (number % maxPrime == 0){
                number /= maxPrime;
                maxPrime = 2;
            }else{
                maxPrime++;
            }
        }
        return maxPrime;
    }








}
