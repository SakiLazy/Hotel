package com.hziee.hotel.Mapper;

import com.hziee.hotel.Bean.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoomMapper {

    @Select("select type,price,stock from room")
    List<Room> findAllRoom();
}
