package observer.weatherobserver;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 8:57
 * @project DesignPattern
 * @Version 1.0.0
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){

    }

    public void measurementChanged(){
        //note1: 注意设置setChanged来更改状态
        setChanged();
        //更新
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
