package Scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    //When looking for a variable, (privateVar in this case) Java will check the narrowest scope first. Here, privateVar is defined locally within the method, so we use that one
    //i is declared in the for-loop, so its scope is limited to stuff inside the for-loop
    public void timesTwo(){
        //if we commented out the line below, this method would use the privateVar that has been assigned the value of 1 instead
        int varTwo = 2;
        for(int i=0; i<10; i++){
            System.out.println(i + " times two is " + i*varTwo);
        }
//If we wanted to specifically use the privateVar with the value of 1, we could use the "this" keyword, to use the privateVar belonging to this class
//        for(int i=0; i<10; i++){
//            System.out.println(i + " times two is " + i*this.privateVar);
        }

        //====================================================
        public class InnerClass{
            public int varThree = 3;

            public InnerClass() {
                System.out.println("InnerClass created, privateVar is " + varThree);
            }


            //this method will grab the privateVar from InnerClass, with the value of 3
            public void timesTwo(){
                for(int i=0; i<10; i++){
                    System.out.println(i + " times two is " + i* varThree);
                }
            }

        }

}
