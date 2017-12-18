package com.yuhualing.www.gdms.service;

import com.yuhualing.www.gdms.dto.HotelDTO;

import java.util.List;

/**
 * Created by macbook on 2017/12/18.
 */
public interface IHotelService {

    public int saveHotel(HotelDTO hotelDTO);

    public void deleteHotelById(Integer hotelId);

    public void updateHotel(HotelDTO hotelDTO);

    public HotelDTO queryHotelById(Integer hotelId);

    public List<HotelDTO> queryHotelList(HotelDTO hotelDTO);
}
