package iterator.dinermerger;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 14:58
 * @project DesignPattern
 * @Version 1.0.0
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;
    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next(){
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
            return false;
        }else{
            return true;
        }
    }
}
