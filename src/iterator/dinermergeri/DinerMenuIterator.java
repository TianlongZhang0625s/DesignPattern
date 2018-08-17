package iterator.dinermergeri;

import java.util.Iterator;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 16:20
 * @project DesignPattern
 * @Version 1.0.0
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
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
        }else {
            return true;
        }
    }

    public void remove(){
        if (position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }

        if(menuItems[position - 1] != null){
            for (int i = position - 1; i < (menuItems.length - 1); i++){
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
