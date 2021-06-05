package Scope;

public class Main {

    public static void main(String[] args) {
        String varFour = "this string is private to Main";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        //this will only work if varThree is made public
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("varThree is not accessible here " + innerClass.varThree);



//        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//        System.out.println("*******************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();

    }
}
