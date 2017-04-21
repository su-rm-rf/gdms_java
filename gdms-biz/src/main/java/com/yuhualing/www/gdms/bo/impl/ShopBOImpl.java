package com.yuhualing.www.gdms.bo.impl;

import com.yuhualing.www.gdms.bo.IShopBO;
import com.yuhualing.www.gdms.dao.IShopDao;
import com.yuhualing.www.gdms.dto.ShopDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by macbook on 17/4/21.
 */
@Service("shopBo")
public class ShopBOImpl implements IShopBO {

    @Resource
    IShopDao shopDao;

    @Override
    public List<ShopDTO> searchShopList(ShopDTO shopDTO) {
        return null;
    }

}
