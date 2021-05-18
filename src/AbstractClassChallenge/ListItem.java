package AbstractClassChallenge;

public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object object){
        this.value = object;
    }

    public abstract ListItem next();
    public abstract ListItem setNext(ListItem item);
    public abstract ListItem previous();
    public abstract ListItem setPrevious(ListItem item);
    public abstract int compareTo(ListItem item);
    public abstract void getValue();
    public abstract void setValue(Object obj);
}
