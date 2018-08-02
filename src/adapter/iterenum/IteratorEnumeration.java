package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Tianlong Zhang
 * @time 2018/8/2 21:14
 * @project DesignPattern
 * @Version 1.0.0
 */
public class IteratorEnumeration implements Enumeration<Object> {

    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
