package observer.weather;

import java.util.ArrayList;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 8:16
 * @project DesignPattern
 * @Version 1.0.0
 */
public class WeatherData implements Subject{
    private float termperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObservers(Observer observer){
        observers.add(observer);
    }

    public void removeObservers(Observer observer){
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(observer);
        }
    }

    public void notifyObservers(){
        for (Observer observer: observers) {
            observer.update(termperature,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurement(float termperature,float humidity,float pressure){
        this.termperature = termperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTermperature() {
        return termperature;
    }
}
