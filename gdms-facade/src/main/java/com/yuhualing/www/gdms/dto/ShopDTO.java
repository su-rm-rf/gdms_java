package com.yuhualing.www.gdms.dto;

/**
 * Created by macbook on 17/4/20.
 */
public class ShopDTO {

    private Integer shopId;

    private String shopName;

    private String shopCity;

    private String shopAddress;

    public ShopDTO() {
    }

    public ShopDTO(String shopName, String shopCity, String shopAddress) {
        this.shopName = shopName;
        this.shopCity = shopCity;
        this.shopAddress = shopAddress;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopCity() {
        return shopCity;
    }

    public void setShopCity(String shopCity) {
        this.shopCity = shopCity;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
}
