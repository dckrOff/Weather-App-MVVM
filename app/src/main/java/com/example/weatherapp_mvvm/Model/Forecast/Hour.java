
package com.example.weatherapp_mvvm.Model.Forecast;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hour implements Serializable
{

    @SerializedName("time_epoch")
    @Expose
    private Integer timeEpoch;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("temp_c")
    @Expose
    private Double tempC;
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
    private Double windKph;
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
    private Double pressureIn;
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
    @SerializedName("windchill_c")
    @Expose
    private Double windchillC;
    @SerializedName("windchill_f")
    @Expose
    private Double windchillF;
    @SerializedName("heatindex_c")
    @Expose
    private Double heatindexC;
    @SerializedName("heatindex_f")
    @Expose
    private Double heatindexF;
    @SerializedName("dewpoint_c")
    @Expose
    private Double dewpointC;
    @SerializedName("dewpoint_f")
    @Expose
    private Double dewpointF;
    @SerializedName("will_it_rain")
    @Expose
    private Integer willItRain;
    @SerializedName("chance_of_rain")
    @Expose
    private Integer chanceOfRain;
    @SerializedName("will_it_snow")
    @Expose
    private Integer willItSnow;
    @SerializedName("chance_of_snow")
    @Expose
    private Integer chanceOfSnow;
    @SerializedName("vis_km")
    @Expose
    private Integer visKm;
    @SerializedName("vis_miles")
    @Expose
    private Integer visMiles;
    @SerializedName("gust_mph")
    @Expose
    private Double gustMph;
    @SerializedName("gust_kph")
    @Expose
    private Double gustKph;
    @SerializedName("uv")
    @Expose
    private Integer uv;
    @SerializedName("air_quality")
    @Expose
    private AirQuality airQuality;
    private final static long serialVersionUID = -2137926890193655552L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hour() {
    }

    /**
     * 
     * @param precipMm
     * @param heatindexF
     * @param timeEpoch
     * @param feelslikeC
     * @param heatindexC
     * @param gustMph
     * @param gustKph
     * @param dewpointC
     * @param windDir
     * @param pressureIn
     * @param precipIn
     * @param chanceOfRain
     * @param dewpointF
     * @param cloud
     * @param windMph
     * @param visKm
     * @param windKph
     * @param humidity
     * @param windDegree
     * @param chanceOfSnow
     * @param visMiles
     * @param tempF
     * @param willItRain
     * @param uv
     * @param airQuality
     * @param windchillC
     * @param windchillF
     * @param isDay
     * @param willItSnow
     * @param condition
     * @param feelslikeF
     * @param time
     * @param pressureMb
     * @param tempC
     */
    public Hour(Integer timeEpoch, String time, Double tempC, Double tempF, Integer isDay, Condition condition, Double windMph, Double windKph, Integer windDegree, String windDir, Integer pressureMb, Double pressureIn, Integer precipMm, Integer precipIn, Integer humidity, Integer cloud, Double feelslikeC, Double feelslikeF, Double windchillC, Double windchillF, Double heatindexC, Double heatindexF, Double dewpointC, Double dewpointF, Integer willItRain, Integer chanceOfRain, Integer willItSnow, Integer chanceOfSnow, Integer visKm, Integer visMiles, Double gustMph, Double gustKph, Integer uv, AirQuality airQuality) {
        super();
        this.timeEpoch = timeEpoch;
        this.time = time;
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
        this.windchillC = windchillC;
        this.windchillF = windchillF;
        this.heatindexC = heatindexC;
        this.heatindexF = heatindexF;
        this.dewpointC = dewpointC;
        this.dewpointF = dewpointF;
        this.willItRain = willItRain;
        this.chanceOfRain = chanceOfRain;
        this.willItSnow = willItSnow;
        this.chanceOfSnow = chanceOfSnow;
        this.visKm = visKm;
        this.visMiles = visMiles;
        this.gustMph = gustMph;
        this.gustKph = gustKph;
        this.uv = uv;
        this.airQuality = airQuality;
    }

    public Integer getTimeEpoch() {
        return timeEpoch;
    }

    public void setTimeEpoch(Integer timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
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

    public Double getWindKph() {
        return windKph;
    }

    public void setWindKph(Double windKph) {
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

    public Double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(Double pressureIn) {
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

    public Double getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(Double windchillC) {
        this.windchillC = windchillC;
    }

    public Double getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(Double windchillF) {
        this.windchillF = windchillF;
    }

    public Double getHeatindexC() {
        return heatindexC;
    }

    public void setHeatindexC(Double heatindexC) {
        this.heatindexC = heatindexC;
    }

    public Double getHeatindexF() {
        return heatindexF;
    }

    public void setHeatindexF(Double heatindexF) {
        this.heatindexF = heatindexF;
    }

    public Double getDewpointC() {
        return dewpointC;
    }

    public void setDewpointC(Double dewpointC) {
        this.dewpointC = dewpointC;
    }

    public Double getDewpointF() {
        return dewpointF;
    }

    public void setDewpointF(Double dewpointF) {
        this.dewpointF = dewpointF;
    }

    public Integer getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(Integer willItRain) {
        this.willItRain = willItRain;
    }

    public Integer getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(Integer chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public Integer getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(Integer willItSnow) {
        this.willItSnow = willItSnow;
    }

    public Integer getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(Integer chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
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

    public Double getGustMph() {
        return gustMph;
    }

    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    public Double getGustKph() {
        return gustKph;
    }

    public void setGustKph(Double gustKph) {
        this.gustKph = gustKph;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
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
        sb.append(Hour.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeEpoch");
        sb.append('=');
        sb.append(((this.timeEpoch == null)?"<null>":this.timeEpoch));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
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
        sb.append("windchillC");
        sb.append('=');
        sb.append(((this.windchillC == null)?"<null>":this.windchillC));
        sb.append(',');
        sb.append("windchillF");
        sb.append('=');
        sb.append(((this.windchillF == null)?"<null>":this.windchillF));
        sb.append(',');
        sb.append("heatindexC");
        sb.append('=');
        sb.append(((this.heatindexC == null)?"<null>":this.heatindexC));
        sb.append(',');
        sb.append("heatindexF");
        sb.append('=');
        sb.append(((this.heatindexF == null)?"<null>":this.heatindexF));
        sb.append(',');
        sb.append("dewpointC");
        sb.append('=');
        sb.append(((this.dewpointC == null)?"<null>":this.dewpointC));
        sb.append(',');
        sb.append("dewpointF");
        sb.append('=');
        sb.append(((this.dewpointF == null)?"<null>":this.dewpointF));
        sb.append(',');
        sb.append("willItRain");
        sb.append('=');
        sb.append(((this.willItRain == null)?"<null>":this.willItRain));
        sb.append(',');
        sb.append("chanceOfRain");
        sb.append('=');
        sb.append(((this.chanceOfRain == null)?"<null>":this.chanceOfRain));
        sb.append(',');
        sb.append("willItSnow");
        sb.append('=');
        sb.append(((this.willItSnow == null)?"<null>":this.willItSnow));
        sb.append(',');
        sb.append("chanceOfSnow");
        sb.append('=');
        sb.append(((this.chanceOfSnow == null)?"<null>":this.chanceOfSnow));
        sb.append(',');
        sb.append("visKm");
        sb.append('=');
        sb.append(((this.visKm == null)?"<null>":this.visKm));
        sb.append(',');
        sb.append("visMiles");
        sb.append('=');
        sb.append(((this.visMiles == null)?"<null>":this.visMiles));
        sb.append(',');
        sb.append("gustMph");
        sb.append('=');
        sb.append(((this.gustMph == null)?"<null>":this.gustMph));
        sb.append(',');
        sb.append("gustKph");
        sb.append('=');
        sb.append(((this.gustKph == null)?"<null>":this.gustKph));
        sb.append(',');
        sb.append("uv");
        sb.append('=');
        sb.append(((this.uv == null)?"<null>":this.uv));
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
        result = ((result* 31)+((this.heatindexF == null)? 0 :this.heatindexF.hashCode()));
        result = ((result* 31)+((this.timeEpoch == null)? 0 :this.timeEpoch.hashCode()));
        result = ((result* 31)+((this.feelslikeC == null)? 0 :this.feelslikeC.hashCode()));
        result = ((result* 31)+((this.heatindexC == null)? 0 :this.heatindexC.hashCode()));
        result = ((result* 31)+((this.gustMph == null)? 0 :this.gustMph.hashCode()));
        result = ((result* 31)+((this.gustKph == null)? 0 :this.gustKph.hashCode()));
        result = ((result* 31)+((this.dewpointC == null)? 0 :this.dewpointC.hashCode()));
        result = ((result* 31)+((this.windDir == null)? 0 :this.windDir.hashCode()));
        result = ((result* 31)+((this.pressureIn == null)? 0 :this.pressureIn.hashCode()));
        result = ((result* 31)+((this.precipIn == null)? 0 :this.precipIn.hashCode()));
        result = ((result* 31)+((this.chanceOfRain == null)? 0 :this.chanceOfRain.hashCode()));
        result = ((result* 31)+((this.dewpointF == null)? 0 :this.dewpointF.hashCode()));
        result = ((result* 31)+((this.cloud == null)? 0 :this.cloud.hashCode()));
        result = ((result* 31)+((this.windMph == null)? 0 :this.windMph.hashCode()));
        result = ((result* 31)+((this.visKm == null)? 0 :this.visKm.hashCode()));
        result = ((result* 31)+((this.windKph == null)? 0 :this.windKph.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.windDegree == null)? 0 :this.windDegree.hashCode()));
        result = ((result* 31)+((this.chanceOfSnow == null)? 0 :this.chanceOfSnow.hashCode()));
        result = ((result* 31)+((this.visMiles == null)? 0 :this.visMiles.hashCode()));
        result = ((result* 31)+((this.tempF == null)? 0 :this.tempF.hashCode()));
        result = ((result* 31)+((this.willItRain == null)? 0 :this.willItRain.hashCode()));
        result = ((result* 31)+((this.uv == null)? 0 :this.uv.hashCode()));
        result = ((result* 31)+((this.airQuality == null)? 0 :this.airQuality.hashCode()));
        result = ((result* 31)+((this.windchillC == null)? 0 :this.windchillC.hashCode()));
        result = ((result* 31)+((this.windchillF == null)? 0 :this.windchillF.hashCode()));
        result = ((result* 31)+((this.isDay == null)? 0 :this.isDay.hashCode()));
        result = ((result* 31)+((this.willItSnow == null)? 0 :this.willItSnow.hashCode()));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.feelslikeF == null)? 0 :this.feelslikeF.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.pressureMb == null)? 0 :this.pressureMb.hashCode()));
        result = ((result* 31)+((this.tempC == null)? 0 :this.tempC.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hour) == false) {
            return false;
        }
        Hour rhs = ((Hour) other);
        return (((((((((((((((((((((((((((((((((((this.precipMm == rhs.precipMm)||((this.precipMm!= null)&&this.precipMm.equals(rhs.precipMm)))&&((this.heatindexF == rhs.heatindexF)||((this.heatindexF!= null)&&this.heatindexF.equals(rhs.heatindexF))))&&((this.timeEpoch == rhs.timeEpoch)||((this.timeEpoch!= null)&&this.timeEpoch.equals(rhs.timeEpoch))))&&((this.feelslikeC == rhs.feelslikeC)||((this.feelslikeC!= null)&&this.feelslikeC.equals(rhs.feelslikeC))))&&((this.heatindexC == rhs.heatindexC)||((this.heatindexC!= null)&&this.heatindexC.equals(rhs.heatindexC))))&&((this.gustMph == rhs.gustMph)||((this.gustMph!= null)&&this.gustMph.equals(rhs.gustMph))))&&((this.gustKph == rhs.gustKph)||((this.gustKph!= null)&&this.gustKph.equals(rhs.gustKph))))&&((this.dewpointC == rhs.dewpointC)||((this.dewpointC!= null)&&this.dewpointC.equals(rhs.dewpointC))))&&((this.windDir == rhs.windDir)||((this.windDir!= null)&&this.windDir.equals(rhs.windDir))))&&((this.pressureIn == rhs.pressureIn)||((this.pressureIn!= null)&&this.pressureIn.equals(rhs.pressureIn))))&&((this.precipIn == rhs.precipIn)||((this.precipIn!= null)&&this.precipIn.equals(rhs.precipIn))))&&((this.chanceOfRain == rhs.chanceOfRain)||((this.chanceOfRain!= null)&&this.chanceOfRain.equals(rhs.chanceOfRain))))&&((this.dewpointF == rhs.dewpointF)||((this.dewpointF!= null)&&this.dewpointF.equals(rhs.dewpointF))))&&((this.cloud == rhs.cloud)||((this.cloud!= null)&&this.cloud.equals(rhs.cloud))))&&((this.windMph == rhs.windMph)||((this.windMph!= null)&&this.windMph.equals(rhs.windMph))))&&((this.visKm == rhs.visKm)||((this.visKm!= null)&&this.visKm.equals(rhs.visKm))))&&((this.windKph == rhs.windKph)||((this.windKph!= null)&&this.windKph.equals(rhs.windKph))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.windDegree == rhs.windDegree)||((this.windDegree!= null)&&this.windDegree.equals(rhs.windDegree))))&&((this.chanceOfSnow == rhs.chanceOfSnow)||((this.chanceOfSnow!= null)&&this.chanceOfSnow.equals(rhs.chanceOfSnow))))&&((this.visMiles == rhs.visMiles)||((this.visMiles!= null)&&this.visMiles.equals(rhs.visMiles))))&&((this.tempF == rhs.tempF)||((this.tempF!= null)&&this.tempF.equals(rhs.tempF))))&&((this.willItRain == rhs.willItRain)||((this.willItRain!= null)&&this.willItRain.equals(rhs.willItRain))))&&((this.uv == rhs.uv)||((this.uv!= null)&&this.uv.equals(rhs.uv))))&&((this.airQuality == rhs.airQuality)||((this.airQuality!= null)&&this.airQuality.equals(rhs.airQuality))))&&((this.windchillC == rhs.windchillC)||((this.windchillC!= null)&&this.windchillC.equals(rhs.windchillC))))&&((this.windchillF == rhs.windchillF)||((this.windchillF!= null)&&this.windchillF.equals(rhs.windchillF))))&&((this.isDay == rhs.isDay)||((this.isDay!= null)&&this.isDay.equals(rhs.isDay))))&&((this.willItSnow == rhs.willItSnow)||((this.willItSnow!= null)&&this.willItSnow.equals(rhs.willItSnow))))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&((this.feelslikeF == rhs.feelslikeF)||((this.feelslikeF!= null)&&this.feelslikeF.equals(rhs.feelslikeF))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.pressureMb == rhs.pressureMb)||((this.pressureMb!= null)&&this.pressureMb.equals(rhs.pressureMb))))&&((this.tempC == rhs.tempC)||((this.tempC!= null)&&this.tempC.equals(rhs.tempC))));
    }

}
