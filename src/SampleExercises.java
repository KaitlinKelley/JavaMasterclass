public class SampleExercises {

    public static void main(String[] args) {

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





}
