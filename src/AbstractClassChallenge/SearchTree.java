package AbstractClassChallenge;

import java.util.List;

public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    private void performRemoval(ListItem item1, ListItem item2){

    }

    @Override
    public void traverse(ListItem root) {

    }
}
