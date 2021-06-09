package Static;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("First Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("Second Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("Third Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
    }

}
