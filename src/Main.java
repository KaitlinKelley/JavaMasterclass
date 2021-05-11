import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static MobilePhone mobile = new MobilePhone("12345");


    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter Action: (press 6 to see options again)");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }
    }

    private static void queryContact(){
        System.out.println("enter existing contact name");
        String name = sc.nextLine();
        Contact contactToQuery = mobile.queryContact(name);
        if(contactToQuery == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println(contactToQuery.getName() + contactToQuery.getPhoneNumber());
    }

    private static void removeContact(){
            System.out.println("enter existing contact name");
            String name = sc.nextLine();
            Contact contactToDelete = mobile.queryContact(name);
            if(contactToDelete == null){
                System.out.println("Contact not found");
                return;
            }

            if(mobile.removeContact(contactToDelete)){
                System.out.println("Successfully deleted");
            }else{
                System.out.println("Error deleting contact");
            }
    }

    private static void updateContact(){
            System.out.println("enter existing contact name");
            String name = sc.nextLine();
            Contact contactToUpdate = mobile.queryContact(name);
            if(contactToUpdate == null){
                System.out.println("Contact not found");
                return;
            }
            System.out.println("Enter new name");
            String newName = sc.nextLine();
            System.out.println("Enter new number");
            String newNumber = sc.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            if(mobile.updateContact(contactToUpdate, newContact)){
                System.out.println("Successfully updated");
            }else{
                System.out.println("Error updating contact");
            }
    }

    private static void addNewContact() {
            System.out.println("Enter new contact name");
            String name = sc.nextLine();
            System.out.println("Enter phone number");
            String phone = sc.nextLine();
            Contact newContact = Contact.createContact(name, phone);
            if(mobile.addNewContact(newContact)){
                System.out.println("New contact added");
            }else{
                System.out.println("Cannot add, name already on file");
            }
    }


    public static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("Press");
        System.out.println("0 - shut down");
        System.out.println("1 - print contacts");
        System.out.println("2 - add contacts");
        System.out.println("3 - update existing contact");
        System.out.println("4 - to remove an existing contact");
        System.out.println("5 - see if contact exists");
        System.out.println("6 - print list of available actions");
        System.out.println("Enter your choice: ");
    }

}
