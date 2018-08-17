package iterator.dinermerger;

import java.util.Calendar;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 15:42
 * @project DesignPattern
 * @Version 1.0.0
 */
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    public MenuItem next(){
        MenuItem menuItem = menuItems[position];
        position = position + 2;
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

    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
