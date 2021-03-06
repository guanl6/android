package com.example.admin.myapplication.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CITY".
 */
public class City {

    private Long id;
    /** Not-null value. */
    private String province;
    /** Not-null value. */
    private String cityname;
    private String weatherCode;
    private String weatherInfo;
    private String temperature;

    public City() {
    }

    public City(Long id) {
        this.id = id;
    }

    public City(Long id, String province, String cityname, String weatherCode, String weatherInfo, String temperature) {
        this.id = id;
        this.province = province;
        this.cityname = cityname;
        this.weatherCode = weatherCode;
        this.weatherInfo = weatherInfo;
        this.temperature = temperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getProvince() {
        return province;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setProvince(String province) {
        this.province = province;
    }

    /** Not-null value. */
    public String getCityname() {
        return cityname;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(String weatherInfo) {
        this.weatherInfo = weatherInfo;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

}
