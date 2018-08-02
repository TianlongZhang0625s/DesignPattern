package adapter.iterenum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 21:23
 * @project DesignPattern
 * @Version 1.0.0
 */
public class EI {
    public static void main(String[] args){
        Vector<String> v = new Vector<String>(Arrays.asList(args));
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.hasMoreElements());
        }

        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
