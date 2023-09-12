
package com.example.weatherapp_mvvm.Model.Forecast;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecastday implements Serializable
{

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_epoch")
    @Expose
    private Integer dateEpoch;
    @SerializedName("day")
    @Expose
    private Day day;
    @SerializedName("astro")
    @Expose
    private Astro astro;
    @SerializedName("hour")
    @Expose
    private List<Hour> hour;
    private final static long serialVersionUID = 4312967781273222995L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Forecastday() {
    }

    /**
     * 
     * @param date
     * @param dateEpoch
     * @param astro
     * @param hour
     * @param day
     */
    public Forecastday(String date, Integer dateEpoch, Day day, Astro astro, List<Hour> hour) {
        super();
        this.date = date;
        this.dateEpoch = dateEpoch;
        this.day = day;
        this.astro = astro;
        this.hour = hour;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDateEpoch() {
        return dateEpoch;
    }

    public void setDateEpoch(Integer dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public List<Hour> getHour() {
        return hour;
    }

    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Forecastday.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("dateEpoch");
        sb.append('=');
        sb.append(((this.dateEpoch == null)?"<null>":this.dateEpoch));
        sb.append(',');
        sb.append("day");
        sb.append('=');
        sb.append(((this.day == null)?"<null>":this.day));
        sb.append(',');
        sb.append("astro");
        sb.append('=');
        sb.append(((this.astro == null)?"<null>":this.astro));
        sb.append(',');
        sb.append("hour");
        sb.append('=');
        sb.append(((this.hour == null)?"<null>":this.hour));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.dateEpoch == null)? 0 :this.dateEpoch.hashCode()));
        result = ((result* 31)+((this.astro == null)? 0 :this.astro.hashCode()));
        result = ((result* 31)+((this.hour == null)? 0 :this.hour.hashCode()));
        result = ((result* 31)+((this.day == null)? 0 :this.day.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Forecastday) == false) {
            return false;
        }
        Forecastday rhs = ((Forecastday) other);
        return ((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.dateEpoch == rhs.dateEpoch)||((this.dateEpoch!= null)&&this.dateEpoch.equals(rhs.dateEpoch))))&&((this.astro == rhs.astro)||((this.astro!= null)&&this.astro.equals(rhs.astro))))&&((this.hour == rhs.hour)||((this.hour!= null)&&this.hour.equals(rhs.hour))))&&((this.day == rhs.day)||((this.day!= null)&&this.day.equals(rhs.day))));
    }

}
