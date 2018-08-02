package adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 21:20
 * @project DesignPattern
 * @Version 1.0.0
 */
public class IteratorEnumerationTest {
    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
