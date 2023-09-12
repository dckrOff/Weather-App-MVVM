
package com.example.weatherapp_mvvm.Model.Forecast;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alerts implements Serializable
{

    @SerializedName("alert")
    @Expose
    private List<Object> alert;
    private final static long serialVersionUID = 6788283930680071538L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Alerts() {
    }

    /**
     * 
     * @param alert
     */
    public Alerts(List<Object> alert) {
        super();
        this.alert = alert;
    }

    public List<Object> getAlert() {
        return alert;
    }

    public void setAlert(List<Object> alert) {
        this.alert = alert;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Alerts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("alert");
        sb.append('=');
        sb.append(((this.alert == null)?"<null>":this.alert));
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
        result = ((result* 31)+((this.alert == null)? 0 :this.alert.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Alerts) == false) {
            return false;
        }
        Alerts rhs = ((Alerts) other);
        return ((this.alert == rhs.alert)||((this.alert!= null)&&this.alert.equals(rhs.alert)));
    }

}
