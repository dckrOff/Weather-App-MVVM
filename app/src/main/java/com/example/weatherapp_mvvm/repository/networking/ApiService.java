package com.example.weatherapp_mvvm.repository.networking;

import com.example.weatherapp_mvvm.Model.Forecast.Forecast;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * WeatherAPI.com interactive API explorer or IO
 * Docs allows you to test our APIs and methods.
 * It returns response headers, response code and
 * response body.
 */
public interface ApiService {


    /**
     * API получение текущей и прогноз погоды
     * <p>
     *
     * @param apiKey   API ключ
     * @param location Место получение прогноза
     *                 (Pass US Zipcode, UK Postcode, Canada Postalcode, IP address,
     *                 Latitude/Longitude (decimal degree) or city name. Visit request
     *                 parameter section to learn more)
     * @param days     кол-во дней прогноза
     * @param aqi      качество воздуха, "yes" - если нужно, "no" - если не нужно
     */
    @GET("forecast.json?")
    Call<Forecast> getWeatherForecastApi(@Query("key") String apiKey,
                                      @Query("q") String location,
                                      @Query("days") int days,
                                      @Query("aqi") String aqi);

}
