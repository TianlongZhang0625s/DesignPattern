package observer.weather;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 8:15
 * @project DesignPattern
 * @Version 1.0.0
 */
public interface Observer {
    public void update(float temperature, float humidity,float pressure);
}
