import java.util.ArrayList;

public class RomanNumerals {
    public static void main(String[] args) {

    }

    public static int numOfDigits(int num){
        ArrayList<Integer> numAsArray = new ArrayList<>();
        do{numAsArray.add(num % 10);
            num /= 10;
        }while (num > 0);
        return numAsArray.size();
    }

    public static String convertUpTo4999(int num){
        if(num >= 5000 || num < 0){
            return "Error!";
        }
        int numOfDigs = numOfDigits(num);
        if(numOfDigs == 1){
            return singleDig(num);
        }else if(numOfDigs == 2){
            return doubleDig(num);
        }else if(numOfDigs == 3){
            return tripleDig(num);
        }else{
            return quadrupleDig(num);
        }
    }

    public static String singleDig(int num){
        if(num < 0 || num > 9){
            return "Error";
        }else{
            switch (num) {
                case 0:
                    return "";
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
        if(remainingDigs >= 10) {
            result += doubleDig(remainingDigs);
        }else{
            result += singleDig(remainingDigs);
        }
        return result;
    }

    public static String quadrupleDig(int num){
        int firstDigit = num / 1000;
        int remainingDigs = num % 1000;

        String result = "";

        switch(firstDigit){
            case 1:
                result += "M";
                break;
            case 2:
                result += "MM";
                break;
            case 3:
                result += "MMM";
                break;
            case 4:
                result += "MMMM";
                break;
        }
        if(remainingDigs >= 100){
            result += tripleDig(remainingDigs);
        }else if(remainingDigs >= 10) {
            result += doubleDig(remainingDigs);
        }else{
            result += singleDig(remainingDigs);
        }
        return result;
    }




}
