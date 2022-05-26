package com.hziee.hotel.Mapper;

import com.hziee.hotel.Bean.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Insert("insert into Oorder(user_name,type,price,in_date,out_date) values(#{user_name},#{type},#{price},#{in_date},#{out_date})")
    void createOrder(@Param("user_name")String user_name,
                     @Param("type")String type,
                     @Param("price")String price,
                     @Param("in_date")String in_date,
                     @Param("out_date")String out_date);

    @Select("select * from Oorder")
    List<Order> findAllOrder();

    @Delete("delete FROM Oorder WHERE id=#{id}")
    void deleteOrder(int id);

    @Select("select price from room WHERE type=#{type}")
    String showDetails(@Param("type")String type,@Param("price")String price);

    @Update("UPDATE Oorder SET user_name=#{user_name},type=#{type},price=#{price},in_date=#{in_date},out_date=#{out_date} WHERE id=#{id}")
    void changeOrder(@Param("user_name")String user_name,
                     @Param("type")String type,
                     @Param("price")String price,
                     @Param("in_date")String in_date,
                     @Param("out_date")String out_date,
                     @Param("id")int id);
}
