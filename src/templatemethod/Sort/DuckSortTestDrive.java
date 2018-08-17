package templatemethod.Sort;

import java.util.Arrays;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 21:04
 * @project DesignPattern
 * @Version 1.0.0
 */
public class DuckSortTestDrive {
    public static void main(String[] args){
        Duck[] ducks = {
                new Duck("Daffy",8),
                new Duck("Dewey",2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting : ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting : ");

        display(ducks);
    }

    public static void display(Duck[] ducks){
        for(Duck duck : ducks){
            System.out.println(duck);
        }
    }
}
