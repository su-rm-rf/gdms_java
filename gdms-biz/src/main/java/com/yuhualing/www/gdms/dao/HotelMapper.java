package com.yuhualing.www.gdms.dao;

import com.yuhualing.www.gdms.model.Hotel;

import java.util.List;

public interface HotelMapper {
    int deleteByPrimaryKey(Integer hotelId);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(Integer hotelId);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);

    List<Hotel> select(Hotel hotel);
}