package com.example.weatherapp_mvvm.repository;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.weatherapp_mvvm.Model.Forecast.Forecast;
import com.example.weatherapp_mvvm.repository.networking.ApiClient;
import com.example.weatherapp_mvvm.repository.networking.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherRepo {

    private final String TAG = "WeatherRepo";

    public MutableLiveData<Forecast> requestWeatherForecast(String location, int days) {
        final MutableLiveData<Forecast> mutableLiveData = new MutableLiveData<>();
        ApiService apiService = ApiClient.getRetrofitInstance().create(ApiService.class);
        apiService.getWeatherForecastApi("1c06bb14c36041239ce131637230609", location, days, "").enqueue(new Callback<Forecast>() {
            @Override
            public void onResponse(@NonNull Call<Forecast> call, @NonNull Response<Forecast> response) {
                Log.e(TAG, "requestWeatherForecast response=" + response);
                if (response.isSuccessful() && response.body() != null) {
                    Log.e(TAG, "requestWeatherForecast response.code=" + response.code());
                    mutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Forecast> call, @NonNull Throwable t) {
                Log.e(TAG, "requestWeatherForecast onFailure" + t.getMessage());
            }
        });
        return mutableLiveData;
    }
}
