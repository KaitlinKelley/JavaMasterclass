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

//        double myDouble = 20.00;
//        double myOtherDouble = 80.00;
//
//        double myThirdDouble = (myDouble + myOtherDouble) * 100.00;
//
//        double myFourthDouble = myThirdDouble % 40.00;
//
//        boolean stepFive = (myFourthDouble == 0) ? true : false;
//
//        System.out.println(stepFive);
//
//        if(!stepFive){
//            System.out.println("Got some remainder.");
//        }

        //If-Else, Methods===============================================

//        boolean isMyGameOver = true;
//        int myScore = 800;
//        int myLevelCompleted = 5;
//        int myBonus = 100;
//
//        int highScore = getFinalScore(isMyGameOver, myScore, myLevelCompleted, myBonus);
//        System.out.println("Your final score was: " + highScore);
//
//        myScore = 10000;
//        myLevelCompleted = 8;
//        myBonus = 200;
//
//        highScore = getFinalScore(isMyGameOver, myScore, myLevelCompleted, myBonus);
//        System.out.println("Your final score was: " + highScore);

        displayHighScorePosition("Foster", calculateHighScorePosition(1500));
        displayHighScorePosition("Nimoy", calculateHighScorePosition(900));
        displayHighScorePosition("Stanzi", calculateHighScorePosition(400));
        displayHighScorePosition("Jon Snow", calculateHighScorePosition(50));

    }



    public static int getFinalScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }else{
            return -1;
        }
    };

    //A method that returns type void can also be known as a "procedure"
    public static void displayHighScorePosition(String name, int position){
        System.out.println("Player " + name + " reached position: " + position);
    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        }else if(playerScore >= 500){
//            return 2;
//        }else if(playerScore >= 100){
//            return 3;
//        }else{
//            return 4;
//        }


        //Alternate solution with a single return statement
        int pos = 4;
        if(playerScore >= 1000){
            pos = 1;
        }else if(playerScore >= 500){
            pos = 2;
        }else if(playerScore >= 100){
            pos = 3;
        }
        return pos;
    };
};


//Expression - a construct that adds up to a single value


