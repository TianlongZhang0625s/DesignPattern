package observer.weather;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 8:13
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface Subject {
    public void registerObservers(Observer observer);
    public void removeObservers(Observer observer);
    public void notifyObservers();
}
