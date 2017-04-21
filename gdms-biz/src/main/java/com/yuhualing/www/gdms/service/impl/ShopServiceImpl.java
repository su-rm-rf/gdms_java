package com.yuhualing.www.gdms.service.impl;

import com.yuhualing.www.gdms.bo.IShopBO;
import com.yuhualing.www.gdms.dao.IShopDao;
import com.yuhualing.www.gdms.dto.ShopDTO;
import com.yuhualing.www.gdms.entity.Shop;
import com.yuhualing.www.gdms.service.IShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by macbook on 17/4/20.
 */
@Service("shopService")
public class ShopServiceImpl implements IShopService {

    @Resource
    IShopDao shopDao;

    @Resource
    IShopBO shopBo;

    @Override
    public Serializable saveShop(ShopDTO shopDTO) {
        Shop shop = new Shop();
        shop.setShopName(shopDTO.getShopName());
        shop.setShopCity(shopDTO.getShopCity());
        shop.setShopAddress(shopDTO.getShopAddress());
        shop.setDelete_flag("N");

        return shopDao.saveShop(shop);
    }

    @Override
    public void deleteShopById(String shopId) {
        shopDao.deleteShopById(shopId);
    }

    @Override
    public void updateShop(ShopDTO shopDTO) {
        Shop shop = new Shop();
        shop.setShopId(shopDTO.getShopId());
        shop.setShopName(shopDTO.getShopName());
        shop.setShopCity(shopDTO.getShopCity());
        shop.setShopAddress(shopDTO.getShopAddress());
        shop.setDelete_flag("N");

        shopDao.updateShop(shop);
    }

    @Override
    public ShopDTO queryShopById(String shopId) {
        Shop shop = shopDao.queryShopById(shopId);

        ShopDTO shopDTO = new ShopDTO();
        shopDTO.setShopId(shop.getShopId());
        shopDTO.setShopName(shop.getShopName());
        shopDTO.setShopCity(shop.getShopCity());
        shopDTO.setShopAddress(shop.getShopAddress());

        return shopDTO;
    }

    @Override
    public List<ShopDTO> queryShopList(ShopDTO shopDTO) {
        Shop shop = new Shop();
        shop.setShopName(shopDTO.getShopName());
        shop.setShopCity(shopDTO.getShopCity());
        shop.setShopAddress(shopDTO.getShopAddress());

        List<Shop> shopList = shopDao.queryShopList(shop);

        List<ShopDTO> shopDTOS = new ArrayList<ShopDTO>();
        Iterator<Shop> iterator = shopList.iterator();
        while(iterator.hasNext()) {
            Shop shop2 = iterator.next();

            ShopDTO shopDTO2 = new ShopDTO();
            shopDTO2.setShopId(shop2.getShopId());
            shopDTO2.setShopName(shop2.getShopName());
            shopDTO2.setShopCity(shop2.getShopCity());
            shopDTO2.setShopAddress(shop2.getShopAddress());

            shopDTOS.add(shopDTO2);
        }

        return shopDTOS;
    }
}
