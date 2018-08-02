package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 21:11
 * @project DesignPattern
 * @Version 1.0.0
 */
public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration ){
        this.enumeration = enumeration;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }

    public Object next(){
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
