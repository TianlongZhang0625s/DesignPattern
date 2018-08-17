package iterator.dinermerger;

import java.util.ArrayList;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 15:06
 * @project DesignPattern
 * @Version 1.0.0
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next(){
        MenuItem menuItem = menuItems.get(position);
        position = position  + 1;
        return  menuItem;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size()){
            return false;
        }else {
            return true;
        }
    }
}
