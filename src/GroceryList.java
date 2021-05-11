
import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items on your list");
        for(int i=0; i < groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("You have removed " + item);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }else{
            return false;
        }
    }

}



//    private static Scanner sc = new Scanner(System.in);
//
//    private static GroceryList groceryList = new GroceryList();
//
//    public static void addItem(){
//        System.out.print("Please enter the grocery item: ");
//        groceryList.addGroceryItem(sc.nextLine());
//    }
//
//    public static void modifyItem(){
//        System.out.print("Enter item number: ");
//        String itemNum = sc.nextLine();
//        System.out.print("Enter replacement item: ");
//        String newItem = sc.nextLine();
//        groceryList.modifyGroceryItem(itemNum, newItem);
//    }
//
//    public static void removeItem(){
//        System.out.print("Enter item number: ");
//        String itemNum = sc.nextLine();
//        groceryList.removeGroceryItem(itemNum);
//    }
//
//    public static void searchForItem(){
//        System.out.print("Enter item to search for: ");
//        String searchItem = sc.nextLine();
//        if(groceryList.onFile(searchItem)){
//            System.out.println("Found " + searchItem);
//        }else{
//            System.out.println("Couldn't find " + searchItem);
//        }
//    }
//
//    public static void processArrayList(){
//        //copying an array list
//        ArrayList<String> newArray = new ArrayList<>();
//        newArray.addAll(groceryList.getGroceryList());
//
//        //Another way to copy an array list
//        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
//
//        //convert arraylist to array
//        String[] myArray = new String[groceryList.getGroceryList().size()];
//        myArray = groceryList.getGroceryList().toArray(myArray);
//    }
//
//    public static void printInstructions(){
//        System.out.println("Press");
//        System.out.println("0 - to print choice options");
//        System.out.println("1 - to print grocery list");
//        System.out.println("2 - to add an item to the list");
//        System.out.println("3 - to modify a list item");
//        System.out.println("4 - to remove a list item");
//        System.out.println("5 - to search for a list item");
//        System.out.println("6 - to quit the application");
//        System.out.println("Enter your choice: ");
//    }
//
//    public static void main(String[] args) {
//        GroceryList groceryList = new GroceryList();
//
//        boolean quit = false;
//        int choice = 0;
//        printInstructions();
//        while(!quit){
//            System.out.println("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine();
//
//            switch(choice){
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
//                case 6:
//                    processArrayList();
//                    break;
//                case 7:
//                    quit = true;
//                    break;
//
//            }
//        }
//    }
//}
