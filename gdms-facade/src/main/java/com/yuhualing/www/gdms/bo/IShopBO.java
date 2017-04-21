package com.yuhualing.www.gdms.bo;

import com.yuhualing.www.gdms.dto.ShopDTO;

import java.util.List;

/**
 * Created by macbook on 17/4/21.
 */
public interface IShopBO {

    public List<ShopDTO> searchShopList(ShopDTO shopDTO);

}
