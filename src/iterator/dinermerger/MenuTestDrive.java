package iterator.dinermerger;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 15:30
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MenuTestDrive {
    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
