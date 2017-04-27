package com.yuhualing.www.gdms.service;

import com.yuhualing.www.gdms.dto.ShopDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by macbook on 17/4/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    @Autowired
    IShopService shopService;

    @Test
    public void testAddUser() {
        ShopDTO shopDTO = new ShopDTO();
        shopDTO.setShopName("陆家嘴");
        shopDTO.setShopCity("上海");
        shopDTO.setShopAddress("上海市浦东区陆家嘴金融城");

        shopService.saveShop(shopDTO);
    }

}
