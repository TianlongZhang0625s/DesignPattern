package adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 21:17
 * @project DesignPattern
 * @Version 1.0.0
 */
public class EmumerationIteratorTest {
    public static void main(String[] args){
        Vector<String> v = new Vector<String>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationIterator((v.elements()));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
