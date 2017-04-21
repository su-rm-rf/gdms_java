package com.yuhualing.www.gdms.dao;

import com.yuhualing.www.gdms.entity.Shop;

import java.io.Serializable;
import java.util.List;

/**
 * Created by macbook on 17/4/20.
 */
public interface IShopDao {

    public Serializable saveShop(Shop shop);

    public void updateShop(Shop shop);

    public void deleteShopById(String shopId);

    public Shop queryShopById(String shopId);

    public List<Shop> queryShopList(Shop shop);
}
