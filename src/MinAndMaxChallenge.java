import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstTurn = true;
        int turnCounter = 0;

        while(turnCounter < 8){
            System.out.println("Please enter a number:");
            if(sc.hasNextInt()){
                int userInt = sc.nextInt();

                if(firstTurn){
                    firstTurn = false;
                    min = userInt;
                    max = userInt;
                    turnCounter++;
                }

                if(userInt > max){
                    max = userInt;
                    turnCounter++;
                }

                if(userInt < min){
                    min = userInt;
                    turnCounter++;
                }

            }else{
                System.out.println("INVALID");
                break;
            }
            sc.nextLine();
        }

        System.out.println("Game over.");
        System.out.println("Minimum was: " + min);
        System.out.println("Maximum was: " + max);
        sc.close();
    }
}
