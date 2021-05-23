package Scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    //When looking for a variable, (privateVar in this case) Java will check the narrowest scope first. Here, privateVar is defined locally within the method, so we use that one
    //i is declared in the for-loop, so its scope is limited to stuff inside the for-loop
    public void timesTwo(){
        //if we commented out the line below, this method would use the privateVar that has been assigned the value of 1 instead
        int privateVar = 2;
        for(int i=0; i<10; i++){
            System.out.println(i + " times two is " + i*privateVar);
        }
//If we wanted to specifically use the privateVar with the value of 1, we could use the "this" keyword, to use the privateVar belonging to this class
//        for(int i=0; i<10; i++){
//            System.out.println(i + " times two is " + i*this.privateVar);
        }

        //====================================================
        public class InnerClass{
            public int privateVar = 3;

            public InnerClass() {
                System.out.println("InnerClass created, privateVar is " + privateVar);
            }


            //this method will grab the privateVar from InnerClass, with the value of 3
            public void timesTwo(){
                for(int i=0; i<10; i++){
                    System.out.println(i + " times two is " + i*privateVar);
                }
            }

        }

}
