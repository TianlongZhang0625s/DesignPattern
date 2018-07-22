package observer.weather;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 8:35
 * @project DesignPattern
 * @Version 1.0.0
 */
public class HeatIndexDisplay implements  Observer,DisplayElement {
    private float heatIndex;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    public void update(float temperature,float humidity,float pressure){
        heatIndex = computeHeatIndex(temperature,humidity);
        display();
    }

    private float computeHeatIndex(float temperature,float humidity){
        float t = temperature, rh = humidity;
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    public void display(){
        System.out.println("Heat index is " + heatIndex);
    }
}
