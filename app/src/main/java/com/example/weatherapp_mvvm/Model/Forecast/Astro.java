
package com.example.weatherapp_mvvm.Model.Forecast;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Astro implements Serializable
{

    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("moonrise")
    @Expose
    private String moonrise;
    @SerializedName("moonset")
    @Expose
    private String moonset;
    @SerializedName("moon_phase")
    @Expose
    private String moonPhase;
    @SerializedName("moon_illumination")
    @Expose
    private String moonIllumination;
    @SerializedName("is_moon_up")
    @Expose
    private Integer isMoonUp;
    @SerializedName("is_sun_up")
    @Expose
    private Integer isSunUp;
    private final static long serialVersionUID = 9218405488923286897L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Astro() {
    }

    /**
     * 
     * @param moonset
     * @param sunrise
     * @param sunset
     * @param isSunUp
     * @param moonrise
     * @param isMoonUp
     * @param moonPhase
     * @param moonIllumination
     */
    public Astro(String sunrise, String sunset, String moonrise, String moonset, String moonPhase, String moonIllumination, Integer isMoonUp, Integer isSunUp) {
        super();
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.moonPhase = moonPhase;
        this.moonIllumination = moonIllumination;
        this.isMoonUp = isMoonUp;
        this.isSunUp = isSunUp;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public String getMoonIllumination() {
        return moonIllumination;
    }

    public void setMoonIllumination(String moonIllumination) {
        this.moonIllumination = moonIllumination;
    }

    public Integer getIsMoonUp() {
        return isMoonUp;
    }

    public void setIsMoonUp(Integer isMoonUp) {
        this.isMoonUp = isMoonUp;
    }

    public Integer getIsSunUp() {
        return isSunUp;
    }

    public void setIsSunUp(Integer isSunUp) {
        this.isSunUp = isSunUp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Astro.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sunrise");
        sb.append('=');
        sb.append(((this.sunrise == null)?"<null>":this.sunrise));
        sb.append(',');
        sb.append("sunset");
        sb.append('=');
        sb.append(((this.sunset == null)?"<null>":this.sunset));
        sb.append(',');
        sb.append("moonrise");
        sb.append('=');
        sb.append(((this.moonrise == null)?"<null>":this.moonrise));
        sb.append(',');
        sb.append("moonset");
        sb.append('=');
        sb.append(((this.moonset == null)?"<null>":this.moonset));
        sb.append(',');
        sb.append("moonPhase");
        sb.append('=');
        sb.append(((this.moonPhase == null)?"<null>":this.moonPhase));
        sb.append(',');
        sb.append("moonIllumination");
        sb.append('=');
        sb.append(((this.moonIllumination == null)?"<null>":this.moonIllumination));
        sb.append(',');
        sb.append("isMoonUp");
        sb.append('=');
        sb.append(((this.isMoonUp == null)?"<null>":this.isMoonUp));
        sb.append(',');
        sb.append("isSunUp");
        sb.append('=');
        sb.append(((this.isSunUp == null)?"<null>":this.isSunUp));
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
        result = ((result* 31)+((this.moonset == null)? 0 :this.moonset.hashCode()));
        result = ((result* 31)+((this.sunrise == null)? 0 :this.sunrise.hashCode()));
        result = ((result* 31)+((this.sunset == null)? 0 :this.sunset.hashCode()));
        result = ((result* 31)+((this.isSunUp == null)? 0 :this.isSunUp.hashCode()));
        result = ((result* 31)+((this.moonrise == null)? 0 :this.moonrise.hashCode()));
        result = ((result* 31)+((this.isMoonUp == null)? 0 :this.isMoonUp.hashCode()));
        result = ((result* 31)+((this.moonPhase == null)? 0 :this.moonPhase.hashCode()));
        result = ((result* 31)+((this.moonIllumination == null)? 0 :this.moonIllumination.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Astro) == false) {
            return false;
        }
        Astro rhs = ((Astro) other);
        return (((((((((this.moonset == rhs.moonset)||((this.moonset!= null)&&this.moonset.equals(rhs.moonset)))&&((this.sunrise == rhs.sunrise)||((this.sunrise!= null)&&this.sunrise.equals(rhs.sunrise))))&&((this.sunset == rhs.sunset)||((this.sunset!= null)&&this.sunset.equals(rhs.sunset))))&&((this.isSunUp == rhs.isSunUp)||((this.isSunUp!= null)&&this.isSunUp.equals(rhs.isSunUp))))&&((this.moonrise == rhs.moonrise)||((this.moonrise!= null)&&this.moonrise.equals(rhs.moonrise))))&&((this.isMoonUp == rhs.isMoonUp)||((this.isMoonUp!= null)&&this.isMoonUp.equals(rhs.isMoonUp))))&&((this.moonPhase == rhs.moonPhase)||((this.moonPhase!= null)&&this.moonPhase.equals(rhs.moonPhase))))&&((this.moonIllumination == rhs.moonIllumination)||((this.moonIllumination!= null)&&this.moonIllumination.equals(rhs.moonIllumination))));
    }

}
