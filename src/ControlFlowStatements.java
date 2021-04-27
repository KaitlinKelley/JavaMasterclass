public class ControlFlowStatements {

    public static void main(String[] args) {

        //Switch Statements
        //test one variable multiple times
//        int switchValue = 3;
//
//        switch(switchValue){
//            case 1:
//                System.out.println("Value was one");
//                //DO NOT FORGET THE BREAK STATEMENTS
//                break;
//
//            case 2:
//                System.out.println("Value was two");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Value was 3, 4, or 5");
//                break;
//
//            default:
//                System.out.println("This is the default");
//                //this last break is not strictly necessary
//                break;
//        }

        char charTest = 'C';

        switch(charTest){
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
                System.out.println("Value was C");
                break;

            case 'D': case 'E':
                System.out.println("Value was D or E");
                break;

            default:
                System.out.println("A thru E were not typed");


        }

    }




}
