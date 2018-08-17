package iterator.dinermerger;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 15:35
 * @project DesignPattern
 * @Version 1.0.0
 */
public class ArrayIterator implements Iterator {
    MenuItem[] menuItems;
    int positon = 0;

    public ArrayIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public MenuItem next(){
        MenuItem menuItem = menuItems[positon];
        positon = positon + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(positon >= menuItems.length || menuItems[positon] == null){
            return false;
        }else {
            return true;
        }
    }
}
