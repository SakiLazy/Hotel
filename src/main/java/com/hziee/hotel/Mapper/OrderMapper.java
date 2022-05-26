package com.hziee.hotel.Mapper;

import com.hziee.hotel.Bean.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Insert("insert into order(user_name,type,price,in_date,out_date) values(#{user_name},#{type},#{price},#{in_date},#{out_date})")
    void createOrder(@Param("user_name")String user_name,
                     @Param("type")String type,
                     @Param("price")String price,
                     @Param("indate")String in_date,
                     @Param("outdate")String out_date);

    @Select("select id,username,type,price,indate,outdate FROM order")
    List<Order> findAllOrder();
}
