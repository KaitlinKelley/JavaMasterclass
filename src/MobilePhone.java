import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    //returns whether or not the new contact was added successfully
    public boolean addNewContact(Contact contact){
//        if(!myContacts.contains(contact)){
//            addNewContact(contact);
//            return true;
//        }else{
//            return false;
//        }

        if(findContact(contact) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }else{
            this.myContacts.add(contact);
            return true;
        }
    }

    //returns whether or not the contact was updated successfully
    public boolean updateContact(Contact contactToUpdate, Contact newContact){
//        if(!myContacts.contains(contactToUpdate)){
//            return false;
//        }else{
//            myContacts.set(myContacts.indexOf(contactToUpdate), newContact);
//            return true;
//        }
//        int positionToUpdate = findContact(contactToUpdate);
//        if(positionToUpdate < 0){
//            System.out.println(contactToUpdate.getName() + " was not found");
//            return false;
//        }else if(findContact(newContact.getName()) != -1) {
//            System.out.println("Contact with that name already exists, update not successful");
//            return false;
//        }
//            this.myContacts.set(positionToUpdate, newContact);
//            return true;
        int position = findContact(contactToUpdate);
        if (position >= 0) {
            this.myContacts.set(position, newContact);
            return true;
        }
        return false;


    }

    //returns whether or not the contact was successfully removed
    public boolean removeContact(Contact contactToDelete){
//        if(!myContacts.contains(contactToDelete)){
//            return false;
//        }else{
//            myContacts.remove(contactToDelete);
//            return true;
//        }
//        if(findContact(contactToDelete) < 0){
//            System.out.println("Contact does not exist, cannot delete");
//            return false;
//        }else{
//            this.myContacts.remove(contactToDelete);
//            System.out.println("Contact deleted");
//            return true;
//        }

        int position = findContact(contactToDelete);
        if (position != -1) {
            this.myContacts.remove(contactToDelete);
            return true;
        }
        return false;
    }

    private int findContact(Contact contactToFind){
        return findContact(contactToFind.getName());
    }

    private int findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            String currentName = myContacts.get(i).getName();
            if(currentName.equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
//        for(int i=0; i<myContacts.size(); i++){
//            String currentName = myContacts.get(i).getName();
//            if(currentName.equals(name)){
//                return myContacts.get(i);
//            }
//        }
//        return null;

        //OR

        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public String queryContactName(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(Contact contact: myContacts){
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }


}
