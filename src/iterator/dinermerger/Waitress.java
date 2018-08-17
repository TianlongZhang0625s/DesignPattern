package iterator.dinermerger;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 15:11
 * @project DesignPattern
 * @Version 1.0.0
 */
public class Waitress {
    Menu panckeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu panckeHouseMenu,Menu dinerMenu){
        this.panckeHouseMenu = panckeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator panckeIterator = panckeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(panckeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetrianMenu(){
        printVegetrianMenu(panckeHouseMenu.createIterator());
        printVegetrianMenu(dinerMenu.createIterator());
    }

    private void printVegetrianMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }

    public boolean isItemVegetarian(String name) {
        Iterator breakfastIterator = panckeHouseMenu.createIterator();
        if (isVegetarian(name, breakfastIterator)) {
            return true;
        }
        Iterator dinnerIterator = dinerMenu.createIterator();
        if (isVegetarian(name, dinnerIterator)) {
            return true;
        }
        return false;
    }

    private boolean isVegetarian(String name, Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }
}
