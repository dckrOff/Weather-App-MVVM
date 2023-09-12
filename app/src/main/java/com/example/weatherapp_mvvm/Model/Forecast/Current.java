
package com.example.weatherapp_mvvm.Model.Forecast;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Current implements Serializable
{

    @SerializedName("last_updated_epoch")
    @Expose
    private Integer lastUpdatedEpoch;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("temp_c")
    @Expose
    private Integer tempC;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("is_day")
    @Expose
    private Integer isDay;
    @SerializedName("condition")
    @Expose
    private Condition condition;
    @SerializedName("wind_mph")
    @Expose
    private Double windMph;
    @SerializedName("wind_kph")
    @Expose
    private Integer windKph;
    @SerializedName("wind_degree")
    @Expose
    private Integer windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mb")
    @Expose
    private Integer pressureMb;
    @SerializedName("pressure_in")
    @Expose
    private Integer pressureIn;
    @SerializedName("precip_mm")
    @Expose
    private Integer precipMm;
    @SerializedName("precip_in")
    @Expose
    private Integer precipIn;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("cloud")
    @Expose
    private Integer cloud;
    @SerializedName("feelslike_c")
    @Expose
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    @Expose
    private Double feelslikeF;
    @SerializedName("vis_km")
    @Expose
    private Integer visKm;
    @SerializedName("vis_miles")
    @Expose
    private Integer visMiles;
    @SerializedName("uv")
    @Expose
    private Integer uv;
    @SerializedName("gust_mph")
    @Expose
    private Double gustMph;
    @SerializedName("gust_kph")
    @Expose
    private Integer gustKph;
    @SerializedName("air_quality")
    @Expose
    private AirQuality airQuality;
    private final static long serialVersionUID = 7912174290599077220L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Current() {
    }

    /**
     * 
     * @param tempF
     * @param precipMm
     * @param uv
     * @param airQuality
     * @param feelslikeC
     * @param gustMph
     * @param gustKph
     * @param windDir
     * @param pressureIn
     * @param precipIn
     * @param isDay
     * @param cloud
     * @param lastUpdated
     * @param condition
     * @param windMph
     * @param visKm
     * @param windKph
     * @param humidity
     * @param feelslikeF
     * @param windDegree
     * @param visMiles
     * @param pressureMb
     * @param lastUpdatedEpoch
     * @param tempC
     */
    public Current(Integer lastUpdatedEpoch, String lastUpdated, Integer tempC, Double tempF, Integer isDay, Condition condition, Double windMph, Integer windKph, Integer windDegree, String windDir, Integer pressureMb, Integer pressureIn, Integer precipMm, Integer precipIn, Integer humidity, Integer cloud, Double feelslikeC, Double feelslikeF, Integer visKm, Integer visMiles, Integer uv, Double gustMph, Integer gustKph, AirQuality airQuality) {
        super();
        this.lastUpdatedEpoch = lastUpdatedEpoch;
        this.lastUpdated = lastUpdated;
        this.tempC = tempC;
        this.tempF = tempF;
        this.isDay = isDay;
        this.condition = condition;
        this.windMph = windMph;
        this.windKph = windKph;
        this.windDegree = windDegree;
        this.windDir = windDir;
        this.pressureMb = pressureMb;
        this.pressureIn = pressureIn;
        this.precipMm = precipMm;
        this.precipIn = precipIn;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslikeC = feelslikeC;
        this.feelslikeF = feelslikeF;
        this.visKm = visKm;
        this.visMiles = visMiles;
        this.uv = uv;
        this.gustMph = gustMph;
        this.gustKph = gustKph;
        this.airQuality = airQuality;
    }

    public Integer getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getTempC() {
        return tempC;
    }

    public void setTempC(Integer tempC) {
        this.tempC = tempC;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getWindMph() {
        return windMph;
    }

    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Integer getWindKph() {
        return windKph;
    }

    public void setWindKph(Integer windKph) {
        this.windKph = windKph;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(Integer pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Integer getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(Integer pressureIn) {
        this.pressureIn = pressureIn;
    }

    public Integer getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(Integer precipMm) {
        this.precipMm = precipMm;
    }

    public Integer getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(Integer precipIn) {
        this.precipIn = precipIn;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Integer getVisKm() {
        return visKm;
    }

    public void setVisKm(Integer visKm) {
        this.visKm = visKm;
    }

    public Integer getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(Integer visMiles) {
        this.visMiles = visMiles;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Double getGustMph() {
        return gustMph;
    }

    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    public Integer getGustKph() {
        return gustKph;
    }

    public void setGustKph(Integer gustKph) {
        this.gustKph = gustKph;
    }

    public AirQuality getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(AirQuality airQuality) {
        this.airQuality = airQuality;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Current.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastUpdatedEpoch");
        sb.append('=');
        sb.append(((this.lastUpdatedEpoch == null)?"<null>":this.lastUpdatedEpoch));
        sb.append(',');
        sb.append("lastUpdated");
        sb.append('=');
        sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
        sb.append(',');
        sb.append("tempC");
        sb.append('=');
        sb.append(((this.tempC == null)?"<null>":this.tempC));
        sb.append(',');
        sb.append("tempF");
        sb.append('=');
        sb.append(((this.tempF == null)?"<null>":this.tempF));
        sb.append(',');
        sb.append("isDay");
        sb.append('=');
        sb.append(((this.isDay == null)?"<null>":this.isDay));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("windMph");
        sb.append('=');
        sb.append(((this.windMph == null)?"<null>":this.windMph));
        sb.append(',');
        sb.append("windKph");
        sb.append('=');
        sb.append(((this.windKph == null)?"<null>":this.windKph));
        sb.append(',');
        sb.append("windDegree");
        sb.append('=');
        sb.append(((this.windDegree == null)?"<null>":this.windDegree));
        sb.append(',');
        sb.append("windDir");
        sb.append('=');
        sb.append(((this.windDir == null)?"<null>":this.windDir));
        sb.append(',');
        sb.append("pressureMb");
        sb.append('=');
        sb.append(((this.pressureMb == null)?"<null>":this.pressureMb));
        sb.append(',');
        sb.append("pressureIn");
        sb.append('=');
        sb.append(((this.pressureIn == null)?"<null>":this.pressureIn));
        sb.append(',');
        sb.append("precipMm");
        sb.append('=');
        sb.append(((this.precipMm == null)?"<null>":this.precipMm));
        sb.append(',');
        sb.append("precipIn");
        sb.append('=');
        sb.append(((this.precipIn == null)?"<null>":this.precipIn));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("cloud");
        sb.append('=');
        sb.append(((this.cloud == null)?"<null>":this.cloud));
        sb.append(',');
        sb.append("feelslikeC");
        sb.append('=');
        sb.append(((this.feelslikeC == null)?"<null>":this.feelslikeC));
        sb.append(',');
        sb.append("feelslikeF");
        sb.append('=');
        sb.append(((this.feelslikeF == null)?"<null>":this.feelslikeF));
        sb.append(',');
        sb.append("visKm");
        sb.append('=');
        sb.append(((this.visKm == null)?"<null>":this.visKm));
        sb.append(',');
        sb.append("visMiles");
        sb.append('=');
        sb.append(((this.visMiles == null)?"<null>":this.visMiles));
        sb.append(',');
        sb.append("uv");
        sb.append('=');
        sb.append(((this.uv == null)?"<null>":this.uv));
        sb.append(',');
        sb.append("gustMph");
        sb.append('=');
        sb.append(((this.gustMph == null)?"<null>":this.gustMph));
        sb.append(',');
        sb.append("gustKph");
        sb.append('=');
        sb.append(((this.gustKph == null)?"<null>":this.gustKph));
        sb.append(',');
        sb.append("airQuality");
        sb.append('=');
        sb.append(((this.airQuality == null)?"<null>":this.airQuality));
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
        result = ((result* 31)+((this.precipMm == null)? 0 :this.precipMm.hashCode()));
        result = ((result* 31)+((this.feelslikeC == null)? 0 :this.feelslikeC.hashCode()));
        result = ((result* 31)+((this.gustMph == null)? 0 :this.gustMph.hashCode()));
        result = ((result* 31)+((this.gustKph == null)? 0 :this.gustKph.hashCode()));
        result = ((result* 31)+((this.windDir == null)? 0 :this.windDir.hashCode()));
        result = ((result* 31)+((this.pressureIn == null)? 0 :this.pressureIn.hashCode()));
        result = ((result* 31)+((this.precipIn == null)? 0 :this.precipIn.hashCode()));
        result = ((result* 31)+((this.cloud == null)? 0 :this.cloud.hashCode()));
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.windMph == null)? 0 :this.windMph.hashCode()));
        result = ((result* 31)+((this.visKm == null)? 0 :this.visKm.hashCode()));
        result = ((result* 31)+((this.windKph == null)? 0 :this.windKph.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.windDegree == null)? 0 :this.windDegree.hashCode()));
        result = ((result* 31)+((this.visMiles == null)? 0 :this.visMiles.hashCode()));
        result = ((result* 31)+((this.lastUpdatedEpoch == null)? 0 :this.lastUpdatedEpoch.hashCode()));
        result = ((result* 31)+((this.tempF == null)? 0 :this.tempF.hashCode()));
        result = ((result* 31)+((this.uv == null)? 0 :this.uv.hashCode()));
        result = ((result* 31)+((this.airQuality == null)? 0 :this.airQuality.hashCode()));
        result = ((result* 31)+((this.isDay == null)? 0 :this.isDay.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.feelslikeF == null)? 0 :this.feelslikeF.hashCode()));
        result = ((result* 31)+((this.pressureMb == null)? 0 :this.pressureMb.hashCode()));
        result = ((result* 31)+((this.tempC == null)? 0 :this.tempC.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Current) == false) {
            return false;
        }
        Current rhs = ((Current) other);
        return (((((((((((((((((((((((((this.precipMm == rhs.precipMm)||((this.precipMm!= null)&&this.precipMm.equals(rhs.precipMm)))&&((this.feelslikeC == rhs.feelslikeC)||((this.feelslikeC!= null)&&this.feelslikeC.equals(rhs.feelslikeC))))&&((this.gustMph == rhs.gustMph)||((this.gustMph!= null)&&this.gustMph.equals(rhs.gustMph))))&&((this.gustKph == rhs.gustKph)||((this.gustKph!= null)&&this.gustKph.equals(rhs.gustKph))))&&((this.windDir == rhs.windDir)||((this.windDir!= null)&&this.windDir.equals(rhs.windDir))))&&((this.pressureIn == rhs.pressureIn)||((this.pressureIn!= null)&&this.pressureIn.equals(rhs.pressureIn))))&&((this.precipIn == rhs.precipIn)||((this.precipIn!= null)&&this.precipIn.equals(rhs.precipIn))))&&((this.cloud == rhs.cloud)||((this.cloud!= null)&&this.cloud.equals(rhs.cloud))))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&((this.windMph == rhs.windMph)||((this.windMph!= null)&&this.windMph.equals(rhs.windMph))))&&((this.visKm == rhs.visKm)||((this.visKm!= null)&&this.visKm.equals(rhs.visKm))))&&((this.windKph == rhs.windKph)||((this.windKph!= null)&&this.windKph.equals(rhs.windKph))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.windDegree == rhs.windDegree)||((this.windDegree!= null)&&this.windDegree.equals(rhs.windDegree))))&&((this.visMiles == rhs.visMiles)||((this.visMiles!= null)&&this.visMiles.equals(rhs.visMiles))))&&((this.lastUpdatedEpoch == rhs.lastUpdatedEpoch)||((this.lastUpdatedEpoch!= null)&&this.lastUpdatedEpoch.equals(rhs.lastUpdatedEpoch))))&&((this.tempF == rhs.tempF)||((this.tempF!= null)&&this.tempF.equals(rhs.tempF))))&&((this.uv == rhs.uv)||((this.uv!= null)&&this.uv.equals(rhs.uv))))&&((this.airQuality == rhs.airQuality)||((this.airQuality!= null)&&this.airQuality.equals(rhs.airQuality))))&&((this.isDay == rhs.isDay)||((this.isDay!= null)&&this.isDay.equals(rhs.isDay))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.feelslikeF == rhs.feelslikeF)||((this.feelslikeF!= null)&&this.feelslikeF.equals(rhs.feelslikeF))))&&((this.pressureMb == rhs.pressureMb)||((this.pressureMb!= null)&&this.pressureMb.equals(rhs.pressureMb))))&&((this.tempC == rhs.tempC)||((this.tempC!= null)&&this.tempC.equals(rhs.tempC))));
    }

}
