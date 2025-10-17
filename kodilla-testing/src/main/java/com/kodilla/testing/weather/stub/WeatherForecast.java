package com.kodilla.testing.weather.stub;

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

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {

        List<Double> temps = new ArrayList<>(temperatures.getTemperatures().values());

        if (temps.size() == 0) {
            System.out.println("Missing Data");
        }

        double sum = 0.0;

        for (int i = 0; i < temps.size(); i++) {
            sum += temps.get(i);
        }
        return sum / temps.size();
    }

    public double calculateMedianTemperature() {
        List<Double> temps = new ArrayList<>(temperatures.getTemperatures().values());

        if (temps.size() == 0) {
            System.out.println("Missing Data");
            return 0.0;
        }

        Collections.sort(temps);

        int size = temps.size();

        if (size % 2 == 0) {
            double middle1 = temps.get(size / 2 - 1);
            double middle2 = temps.get(size / 2);
            return (middle1 + middle2) / 2.0;
        }
        else {
            return temps.get(size / 2);
        }
    }
}