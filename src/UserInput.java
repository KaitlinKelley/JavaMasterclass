import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int validCount = 0;
        int sum = 0;

        while(validCount < 10){
            System.out.println("Please enter number #" + (validCount+1) + ":");
            if(sc.hasNextInt()){
                int userInt = sc.nextInt();
                sum += userInt;
                validCount++;
            }else{
                System.out.println("INVALID. Please enter a valid number.");
            }
            sc.nextLine(); //handles enter key-stroke, helps clear invalid input
        }

        System.out.println("===================");
        System.out.println("Sum: " + sum);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
