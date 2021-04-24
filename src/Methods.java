public class Methods {

    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);

//        calcFeetAndInchesToCentimeters(7, 5);
//        calcFeetAndInchesToCentimeters(36);
//        calcFeetAndInchesToCentimeters(-1, 15);
//        calcFeetAndInchesToCentimeters(3, 13);
//        calcFeetAndInchesToCentimeters(47);

        System.out.println(getDurationString(75, 45));
        System.out.println(getDurationString(3945));

    }

    //Method Overloading==============================================
    //use identical method name, but different parameters
    //like different versions of the same method

    //method overloading requires unique method signatures, so only the parameters are different!
    //method signature = name + parameters

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Nothing here.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid input");
            return -1;
        }else{
            double result = ((feet*12) + inches) * 2.54;
            System.out.println(result + " centimeters");
            return result;
        }
    };

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("Invalid input");
            return -1;
        }else{
            double feet = (int) inches/12;
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value.";
        }else{
            int hours = minutes/60;
            minutes = minutes % 60;
            return String.format("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
        }
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid value.";
        }else{
            int minutes = seconds/60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
    };



}
