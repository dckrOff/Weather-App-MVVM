
package com.example.weatherapp_mvvm.Model.Forecast;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AirQuality implements Serializable
{

    @SerializedName("co")
    @Expose
    private Double co;
    @SerializedName("no2")
    @Expose
    private Integer no2;
    @SerializedName("o3")
    @Expose
    private Double o3;
    @SerializedName("so2")
    @Expose
    private Double so2;
    @SerializedName("pm2_5")
    @Expose
    private Double pm25;
    @SerializedName("pm10")
    @Expose
    private Double pm10;
    @SerializedName("us-epa-index")
    @Expose
    private Integer usEpaIndex;
    @SerializedName("gb-defra-index")
    @Expose
    private Integer gbDefraIndex;
    private final static long serialVersionUID = -5779409554408294279L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AirQuality() {
    }

    /**
     * 
     * @param no2
     * @param o3
     * @param pm25
     * @param so2
     * @param pm10
     * @param co
     * @param usEpaIndex
     * @param gbDefraIndex
     */
    public AirQuality(Double co, Integer no2, Double o3, Double so2, Double pm25, Double pm10, Integer usEpaIndex, Integer gbDefraIndex) {
        super();
        this.co = co;
        this.no2 = no2;
        this.o3 = o3;
        this.so2 = so2;
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.usEpaIndex = usEpaIndex;
        this.gbDefraIndex = gbDefraIndex;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Integer getNo2() {
        return no2;
    }

    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Integer getUsEpaIndex() {
        return usEpaIndex;
    }

    public void setUsEpaIndex(Integer usEpaIndex) {
        this.usEpaIndex = usEpaIndex;
    }

    public Integer getGbDefraIndex() {
        return gbDefraIndex;
    }

    public void setGbDefraIndex(Integer gbDefraIndex) {
        this.gbDefraIndex = gbDefraIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirQuality.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("co");
        sb.append('=');
        sb.append(((this.co == null)?"<null>":this.co));
        sb.append(',');
        sb.append("no2");
        sb.append('=');
        sb.append(((this.no2 == null)?"<null>":this.no2));
        sb.append(',');
        sb.append("o3");
        sb.append('=');
        sb.append(((this.o3 == null)?"<null>":this.o3));
        sb.append(',');
        sb.append("so2");
        sb.append('=');
        sb.append(((this.so2 == null)?"<null>":this.so2));
        sb.append(',');
        sb.append("pm25");
        sb.append('=');
        sb.append(((this.pm25 == null)?"<null>":this.pm25));
        sb.append(',');
        sb.append("pm10");
        sb.append('=');
        sb.append(((this.pm10 == null)?"<null>":this.pm10));
        sb.append(',');
        sb.append("usEpaIndex");
        sb.append('=');
        sb.append(((this.usEpaIndex == null)?"<null>":this.usEpaIndex));
        sb.append(',');
        sb.append("gbDefraIndex");
        sb.append('=');
        sb.append(((this.gbDefraIndex == null)?"<null>":this.gbDefraIndex));
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
        result = ((result* 31)+((this.no2 == null)? 0 :this.no2 .hashCode()));
        result = ((result* 31)+((this.o3 == null)? 0 :this.o3 .hashCode()));
        result = ((result* 31)+((this.pm25 == null)? 0 :this.pm25 .hashCode()));
        result = ((result* 31)+((this.so2 == null)? 0 :this.so2 .hashCode()));
        result = ((result* 31)+((this.pm10 == null)? 0 :this.pm10 .hashCode()));
        result = ((result* 31)+((this.co == null)? 0 :this.co.hashCode()));
        result = ((result* 31)+((this.usEpaIndex == null)? 0 :this.usEpaIndex.hashCode()));
        result = ((result* 31)+((this.gbDefraIndex == null)? 0 :this.gbDefraIndex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirQuality) == false) {
            return false;
        }
        AirQuality rhs = ((AirQuality) other);
        return (((((((((this.no2 == rhs.no2)||((this.no2 != null)&&this.no2 .equals(rhs.no2)))&&((this.o3 == rhs.o3)||((this.o3 != null)&&this.o3 .equals(rhs.o3))))&&((this.pm25 == rhs.pm25)||((this.pm25 != null)&&this.pm25 .equals(rhs.pm25))))&&((this.so2 == rhs.so2)||((this.so2 != null)&&this.so2 .equals(rhs.so2))))&&((this.pm10 == rhs.pm10)||((this.pm10 != null)&&this.pm10 .equals(rhs.pm10))))&&((this.co == rhs.co)||((this.co!= null)&&this.co.equals(rhs.co))))&&((this.usEpaIndex == rhs.usEpaIndex)||((this.usEpaIndex!= null)&&this.usEpaIndex.equals(rhs.usEpaIndex))))&&((this.gbDefraIndex == rhs.gbDefraIndex)||((this.gbDefraIndex!= null)&&this.gbDefraIndex.equals(rhs.gbDefraIndex))));
    }

}
