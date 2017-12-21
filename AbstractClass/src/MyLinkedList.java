/**
 * Created by Arnas on 2017.05.02.
 */
public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }
        }

    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
