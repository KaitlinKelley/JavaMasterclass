package AbstractClassChallenge;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //means list is empty, so the passed-in item is now the root
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                //newItem is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                //new item is less, insert before
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }else{
                    //the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else{
                //items are equal
                System.out.println(newItem.getValue() + " is already present, did not add.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                //means we have found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison < 0){
                currentItem = currentItem.next();
            }else{
                //item is not in the list
                return false;
            }
        }
        //we have reached the end of the list, didn't find anything
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("List is empty");
        }else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

        //could technically also do this, but recursion is probably too deep, could easily crash
//        if(root != null){
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }
}
