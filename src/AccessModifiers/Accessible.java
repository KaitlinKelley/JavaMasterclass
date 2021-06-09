package AccessModifiers;


//Challenge:
//In the following interface declaration, what is the visibility of:
//
//1. the Accessible Interface?
//    package-private

//2. the int variable SOME_CONSTANT?
//    public
//    **all interface variables are public, static, final

//3. methodA?
//    public

//4. methodB?
//    public
//    **all interface methods are automatically public**

//5. methodC?
//    public
//    **all interface methods are automatically public**

interface Accessible {

    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();

}
