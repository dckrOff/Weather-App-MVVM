
package com.example.weatherapp_mvvm.Model.Forecast;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast implements Serializable
{

    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("current")
    @Expose
    private Current current;
    @SerializedName("forecast")
    @Expose
    private Forecast forecast;
    @SerializedName("alerts")
    @Expose
    private Alerts alerts;
    private final static long serialVersionUID = -7888559247463576839L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecast() {
    }

    /**
     * 
     * @param alerts
     * @param current
     * @param location
     * @param forecast
     */
    public Forecast(Location location, Current current, Forecast forecast, Alerts alerts) {
        super();
        this.location = location;
        this.current = current;
        this.forecast = forecast;
        this.alerts = alerts;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Forecast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
        sb.append(',');
        sb.append("forecast");
        sb.append('=');
        sb.append(((this.forecast == null)?"<null>":this.forecast));
        sb.append(',');
        sb.append("alerts");
        sb.append('=');
        sb.append(((this.alerts == null)?"<null>":this.alerts));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.alerts == null)? 0 :this.alerts.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.current == null)? 0 :this.current.hashCode()));
        result = ((result* 31)+((this.forecast == null)? 0 :this.forecast.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Forecast) == false) {
            return false;
        }
        Forecast rhs = ((Forecast) other);
        return (((((this.alerts == rhs.alerts)||((this.alerts!= null)&&this.alerts.equals(rhs.alerts)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.current == rhs.current)||((this.current!= null)&&this.current.equals(rhs.current))))&&((this.forecast == rhs.forecast)||((this.forecast!= null)&&this.forecast.equals(rhs.forecast))));
    }

}
