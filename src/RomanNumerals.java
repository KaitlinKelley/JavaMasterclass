import java.util.ArrayList;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println(tripleDig(562));
        System.out.println(tripleDig(123));
        System.out.println(tripleDig(476));
    }

    public static int numOfDigits(int num){
        ArrayList<Integer> numAsArray = new ArrayList<Integer>();
        do{numAsArray.add(num % 10);
            num /= 10;
        }while (num > 0);
        return numAsArray.size();
    }

    public static String convertUpToThree(int num){
        int numOfDigs = numOfDigits(num);
        if(numOfDigs == 1){
            return singleDig(num);
        }else if(numOfDigs == 2){
            return doubleDig(num);
        }else{
            return tripleDig(num);
        }
    }

    public static String singleDig(int num){
        if(num < 1 || num > 9){
            return "Error";
        }else{
            switch (num) {
                case 1:
                    return "I";
                case 2:
                    return "II";
                case 3:
                    return "III";
                case 4:
                    return "IV";
                case 5:
                    return "V";
                case 6:
                    return "VI";
                case 7:
                    return "VII";
                case 8:
                    return "VIII";
                case 9:
                    return "IX";
                default:
                    throw new IllegalStateException("Unexpected value: " + num);
            }
        }
    }

    public static String doubleDig(int num){
        int lastDigit = num % 10;

        while(num >= 10){
            num /= 10;
        }
        int firstDigit = num;

        String result = "";

        switch(firstDigit){
            case 1:
                result = "X";
                break;
            case 2:
                result = "XX";
                break;
            case 3:
                result = "XXX";
                break;
            case 4:
                result = "XL";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "LX";
                break;
            case 7:
                result = "LXX";
                break;
            case 8:
                result = "LXXX";
                break;
            case 9:
                result = "XC";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }

        if(lastDigit != 0){
            result += singleDig(lastDigit);
        }

        return result;
    }

    public static String tripleDig(int num){
        int firstDigit = num / 100;
        System.out.println("First digit is: " + firstDigit);

        String result = "";

        switch(firstDigit){
            case 1:
                result += "C";
                break;
            case 2:
                result += "CC";
                break;
            case 3:
                result += "CCC";
                break;
            case 4:
                result += "CD";
                break;
            case 5:
                result += "D";
                break;
            case 6:
                result += "DC";
                break;
            case 7:
                result += "DCC";
                break;
            case 8:
                result += "DCCC";
                break;
            case 9:
                result += "CM";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);

        }
        int remainingDigs = num % 100;
        System.out.println("Remainder = " + remainingDigs);
        result += doubleDig(remainingDigs);
        return result;
    }




}
