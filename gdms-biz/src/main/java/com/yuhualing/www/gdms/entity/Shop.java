package com.yuhualing.www.gdms.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by macbook on 17/4/20.
 */
@Entity
@Table(name = "shop")
public class Shop {

    private String shopId;

    private String shopName;

    private String shopCity;

    private String shopAddress;

    private String delete_flag;

    public Shop() {
    }

    public Shop(String shopName, String shopCity, String shopAddress, String delete_flag) {
        this.shopName = shopName;
        this.shopCity = shopCity;
        this.shopAddress = shopAddress;
        this.delete_flag = delete_flag;
    }

    @Id
    @Column(name = "shop_id", nullable = false, length = 32, unique = true)
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
    @GeneratedValue(generator = "generator")
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Column(name = "shop_name", nullable = false, length = 32)
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Column(name = "shop_city", nullable = false, length = 32)
    public String getShopCity() {
        return shopCity;
    }

    public void setShopCity(String shopCity) {
        this.shopCity = shopCity;
    }

    @Column(name = "shop_address", nullable = false, length = 32)
    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(String delete_flag) {
        this.delete_flag = delete_flag;
    }
}
