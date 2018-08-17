package iterator.dinermergeri;

import java.util.Iterator;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 16:13
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
