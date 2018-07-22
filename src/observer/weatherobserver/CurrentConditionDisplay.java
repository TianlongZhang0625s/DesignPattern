package observer.weatherobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 9:04
 * @project DesignPattern
 * @Version 1.0.0
 */
public class CurrentConditionDisplay  implements DisplayElement ,Observer {

    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData ){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
