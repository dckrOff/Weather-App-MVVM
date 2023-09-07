package com.example.weatherapp_mvvm.Model;

public class TempForecast {
    private String time;
    private String humidity;
    private String degree;
    private Boolean isNow;

    public TempForecast(String time, String humidity, String degree, Boolean isNow) {
        this.time = time;
        this.humidity = humidity;
        this.degree = degree;
        this.isNow = isNow;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean isNow() {
        return isNow;
    }

    public void setIsNow(boolean isNow) {
        this.isNow = isNow;
    }
}
