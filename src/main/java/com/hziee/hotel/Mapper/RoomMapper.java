package com.hziee.hotel.Mapper;

import com.hziee.hotel.Bean.Room;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RoomMapper {

    @Select("select type,price,stock from room")
    List<Room> findAllRoom();

    @Select("select stock from room where type=#{type}")
    String leftStock(String type);

    @Update("UPDATE room SET stock=#{stock} WHERE type=#{type}")
    void downStock(String type,String stock);

//
//    //增加新房间
//    @Update("insert into room(id, type, price) VALUES (#{id},#{type},#{price})")
//    @Transactional
//    void createRoom(@Param("id")int id,
//                    @Param("type")String type,
//                    @Param("price")String price);
//
//    //删除房间
//    @Delete("delete from room where id = #{id}")
//    @Transactional
//    void deleteById(int id);
//
//    //按房间号查询房间
//    @Select("select * from room where id = #{id}")
//    @Transactional
//    void selectById();
//
//    //修改房间信息
//    @Update("insert into room (id, type, price, status) values (#{id},#{type},#{price},#{status});")
//    @Transactional
//    void changeRoomById(@Param("id")int id,
//                        @Param("type")String type,
//                        @Param("price")String price,
//                        @Param("status")int status);
//
//    //查询房间状态
//    @Select("select status from room where id = #{id}")
//    @Transactional
//    int getStatus(@Param("id")int id);
//
//    //预定房间(修改房间状态为已预订
//    @Update("update room set status = 1 where id = #{id}")
//    @Transactional
//    void roomDown(@Param("id")int id);
//
//    //退房间(修改房间状态为未预定
//    @Update("update room set status = 0 where id = #{id}")
//    @Transactional
//    void roomUpdate(@Param("id")int id);
//
}
