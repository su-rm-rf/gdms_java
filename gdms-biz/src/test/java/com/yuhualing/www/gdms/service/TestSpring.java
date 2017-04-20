package com.yuhualing.www.gdms.service;

import com.yuhualing.www.gdms.dto.ShopDTO;
import com.yuhualing.www.gdms.service.IShopService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by macbook on 17/4/20.
 */
public class TestSpring {

    @Test
    public void testSaveShop() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IShopService shopService = (IShopService) ac.getBean("shopService");

        ShopDTO shopDTO = new ShopDTO();
        shopDTO.setShopName("陆家嘴金融城");
        shopDTO.setShopCity("上海");
        shopDTO.setShopAddress("上海市浦东信息滨江大道");

        shopService.saveShop(shopDTO);
    }
}
