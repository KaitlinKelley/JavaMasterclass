import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Please enter numbers:");

        while(true){
            if(sc.hasNextInt()){
                int userInt = sc.nextInt();
                sum += userInt;
                count ++;
            }else{
                break;
            }
            sc.nextLine();
        }

        long avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
