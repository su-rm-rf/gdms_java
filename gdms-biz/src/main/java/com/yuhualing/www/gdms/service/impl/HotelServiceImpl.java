package com.yuhualing.www.gdms.service.impl;

import com.yuhualing.www.gdms.dao.HotelMapper;
import com.yuhualing.www.gdms.dto.HotelDTO;
import com.yuhualing.www.gdms.model.Hotel;
import com.yuhualing.www.gdms.service.IHotelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by macbook on 2017/12/18.
 */
@Service("hotelService")
public class HotelServiceImpl implements IHotelService {

    @Resource
    HotelMapper hotelMapper;

    @Override
    public int saveHotel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();
        return 0;
    }

    @Override
    public void deleteHotelById(Integer hotelId) {

    }

    @Override
    public void updateHotel(HotelDTO hotelDTO) {

    }

    @Override
    public HotelDTO queryHotelById(Integer hotelId) {
        return null;
    }

    @Override
    public List<HotelDTO> queryHotelList(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();

        return null;
    }
}
