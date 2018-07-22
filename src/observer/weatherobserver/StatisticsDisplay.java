package observer.weatherobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 9:12
 * @project DesignPattern
 * @Version 1.0.0
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private float tempSum = 0.0f;
    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float numsReading;

    public StatisticsDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            tempSum += weatherData.getTemperature();
            numsReading ++;
            if(maxTemp < weatherData.getTemperature()){
                maxTemp = weatherData.getTemperature();
            }

            if(minTemp > weatherData.getTemperature()){
                minTemp = weatherData.getTemperature();
            }
            display();
        }
    }

    public void display(){
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numsReading)
                + "/" + maxTemp + "/" + minTemp);
    }
}
