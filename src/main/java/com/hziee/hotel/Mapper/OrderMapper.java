package com.hziee.hotel.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface OrderMapper {

    @Insert("insert into order(user_name,type,price,in_date,out_date) values(#{user_name},#{type},#{price},#{in_date},#{out_date})")
    void createOrder(@Param("user_name")String user_name,
                     @Param("type")String type,
                     @Param("price")String price,
                     @Param("in_date")Date in_date,
                     @Param("out_date")Date out_date);
}
