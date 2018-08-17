package iterator.dinermerger;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 14:47
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface Iterator {
    MenuItem next();
    boolean hasNext();
}
