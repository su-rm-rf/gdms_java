package com.yuhualing.www.gdms.controller;

import com.yuhualing.www.gdms.common.Error.ShopErrorMsg;
import com.yuhualing.www.gdms.dto.ShopDTO;
import com.yuhualing.www.gdms.service.IShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by macbook on 17/4/20.
 */
@Controller
@RequestMapping(value = "/shop")
public class ShopController {

    @Resource
    IShopService shopService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ShopErrorMsg saveShop(ShopDTO shopDTO) throws IOException {
        Integer shopId = shopService.saveShop(shopDTO);
        ShopErrorMsg error = new ShopErrorMsg("101", "保存成功", shopId);
        return error;
    }

    @RequestMapping(value = "/delete/{shopId}", method = RequestMethod.POST)
    @ResponseBody
    public ShopErrorMsg deleteShopById(@PathVariable String shopId) throws IOException {
        shopService.deleteShopById( Integer.parseInt(shopId) );
        ShopErrorMsg error = new ShopErrorMsg("101", "删除成功", Integer.parseInt(shopId) );
        return error;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ShopErrorMsg updateShop(ShopDTO shopDTO) throws IOException {
        shopService.updateShop(shopDTO);
        ShopErrorMsg error = new ShopErrorMsg("101", "修改成功", shopDTO.getShopId());
        return error;
    }

    @RequestMapping(value = "/{shopId}", method = RequestMethod.GET)
    @ResponseBody
    public ShopDTO queryShopById(@PathVariable String shopId) throws IOException {
        ShopDTO shopDTO = shopService.queryShopById( Integer.parseInt(shopId) );
        return shopDTO;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<ShopDTO> queryShopList(ShopDTO shopDTO) {
        List<ShopDTO> shopList = shopService.queryShopList(shopDTO);
        return shopList;
    }

}
