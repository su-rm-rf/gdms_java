package com.yuhualing.www.gdms.service.impl;

import com.yuhualing.www.gdms.dao.ShopMapper;
import com.yuhualing.www.gdms.dto.ShopDTO;
import com.yuhualing.www.gdms.model.Shop;
import com.yuhualing.www.gdms.service.IShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by macbook on 17/4/24.
 */
@Service("shopService")
public class ShopServiceImpl implements IShopService {

    @Resource
    ShopMapper shopMapper;

    @Override
    public int saveShop(ShopDTO shopDTO) {
        Shop shop = new Shop();
        shop.setShopName(shopDTO.getShopName());
        shop.setShopCity(shopDTO.getShopCity());
        shop.setShopAddress(shopDTO.getShopAddress());

        int shopId = shopMapper.insert(shop);
        return shopId;
    }

    @Override
    public void deleteShopById(Integer shopId) {
        shopMapper.deleteByPrimaryKey(shopId);
    }

    @Override
    public void updateShop(ShopDTO shopDTO) {
        Shop shop = shopMapper.selectByPrimaryKey(shopDTO.getShopId());

        shop.setShopName(shopDTO.getShopName());
        shop.setShopCity(shopDTO.getShopCity());
        shop.setShopAddress(shopDTO.getShopAddress());

        shopMapper.updateByPrimaryKeySelective(shop);
    }

    @Override
    public ShopDTO queryShopById(Integer shopId) {
        Shop shop = shopMapper.selectByPrimaryKey(shopId);

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

        List<Shop> shopList = shopMapper.select(shop);

        List<ShopDTO> shopDTOS = new ArrayList<ShopDTO>();
        Iterator<Shop> shopIterator = shopList.iterator();
        while(shopIterator.hasNext()) {
            Shop shop2 = shopIterator.next();

            ShopDTO shopDTO1 = new ShopDTO();
            shopDTO1.setShopId(shop2.getShopId());
            shopDTO1.setShopName(shop2.getShopName());
            shopDTO1.setShopCity(shop2.getShopCity());
            shopDTO1.setShopAddress(shop2.getShopAddress());

            shopDTOS.add(shopDTO1);
        }

        return shopDTOS;
    }
}
