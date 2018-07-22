package observer.weather;

/**
 * @author Tianlong Zhang
 * @time 2018/7/18 8:30
 * @project DesignPattern
 * @Version 1.0.0
 */
public class StatisticDisplay implements Observer , DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private float numReadings ;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    public void update(float temperature, float humidity,float pressure){
        tempSum += temperature;
        numReadings ++;

        if(maxTemp < temperature){
            maxTemp = temperature;
        }

        if(temperature < minTemp){
            minTemp = temperature;
        }

        display();
    }

    public void display(){
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
