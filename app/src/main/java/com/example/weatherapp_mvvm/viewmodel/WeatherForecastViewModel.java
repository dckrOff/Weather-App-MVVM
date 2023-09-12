package com.example.weatherapp_mvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weatherapp_mvvm.Model.Forecast.Forecast;
import com.example.weatherapp_mvvm.repository.WeatherRepo;

public class WeatherForecastViewModel extends ViewModel {

    private final WeatherRepo weatherRepo;
    private MutableLiveData<Forecast> weatherForecastLiveData;


    public WeatherForecastViewModel() {
        this.weatherRepo = new WeatherRepo();
    }

    public LiveData<Forecast> getWeatherForecast() {
        if (weatherForecastLiveData != null) {
            weatherForecastLiveData = weatherRepo.requestWeatherForecast("Urgench", 3);
        }
        return weatherForecastLiveData;
    }
}
