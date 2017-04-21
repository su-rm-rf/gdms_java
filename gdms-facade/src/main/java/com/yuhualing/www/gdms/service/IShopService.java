package com.yuhualing.www.gdms.service;

import com.yuhualing.www.gdms.dto.ShopDTO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by macbook on 17/4/20.
 */
public interface IShopService {

    public Serializable saveShop(ShopDTO shopDTO);

    public void deleteShopById(String shopId);

    public void updateShop(ShopDTO shopDTO);

    public ShopDTO queryShopById(String shopId);

    public List<ShopDTO> queryShopList(ShopDTO shopDTO);
}
