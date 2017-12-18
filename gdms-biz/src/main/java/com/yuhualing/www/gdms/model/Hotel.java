package com.yuhualing.www.gdms.model;

/**
 * Created by macbook on 2017/12/18.
 */
public class Hotel {

    private Integer hotelId;
    private String hotelName;
    private String hotelPrice;
    private String checkinDate;
    private Boolean hasBreakfast;

    public Hotel() {}

    public Hotel(String hotelName, String hotelPrice, String checkinDate, Boolean hasBreakfast) {
        this.hotelName = hotelName;
        this.hotelPrice = hotelPrice;
        this.checkinDate = checkinDate;
        this.hasBreakfast = hasBreakfast;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(String hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Boolean getHasBreakfast() {
        return hasBreakfast;
    }

    public void setHasBreakfast(Boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
    }
}
