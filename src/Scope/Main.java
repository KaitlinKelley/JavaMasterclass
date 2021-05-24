package Scope;

public class Main {

    public static void main(String[] args) {
        String varFour = "this string is private to Main";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varFour is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("*******************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

    }
}
