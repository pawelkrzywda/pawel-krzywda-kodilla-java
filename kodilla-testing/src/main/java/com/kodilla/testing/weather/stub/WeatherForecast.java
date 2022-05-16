package com.kodilla.testing.weather.stub;

import java.lang.reflect.Array;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averagetemperature(){
        double average = 0 ;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            average = average + temperature.getValue();
        }
        average = average / (temperatures.getTemperatures().size());
        return average;
    }

    public double findMedianTemp(){
        double median = 0;
        List<Double> tempList = new LinkedList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            tempList.add(temperature.getValue());
        }

        Collections.sort(tempList);
        if((tempList.size() % 2) == 0){
            median = (tempList.get(tempList.size()/2) + tempList.get((tempList.size()/2) - 1))/2;
        }else{
            median = tempList.get(tempList.size()/2);
        }
        return median;
    }
}