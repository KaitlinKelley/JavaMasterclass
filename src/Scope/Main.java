package Scope;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this string is private to Main";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

    }
}
