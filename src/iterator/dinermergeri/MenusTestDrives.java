package iterator.dinermergeri;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 16:35
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MenusTestDrives {
    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);

        waitress.printMenu();
        waitress.printVegetarianMenu();

        System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
        System.out.print("Waitress says: ");

        if(waitress.isItemVegetarian("Hotdog")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        System.out.println("\nCustomer asks, are the Waffles vegetarian?");
        System.out.print("Waitress says: ");

        if(waitress.isItemVegetarian("Waffles")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
