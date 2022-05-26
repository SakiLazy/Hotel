package com.hziee.hotel.Mapper;

import com.hziee.hotel.Bean.Room;
import com.hziee.hotel.Bean.Room2;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface RoomMapper {

    @Select("select type,price,stock from room")
    List<Room> findAllRoom();

    //增加新房间
    @Update("insert into room2(id, type, price) VALUES (#{id},#{type},#{price})")
    @Transactional
    void save(Room2 room2);

    //删除房间
    @Delete("delete from room2 where id = #{id}")
    void deleteById(int id);

    //按房间号查询房间
    @Select("select * ")
    void selectById();

    //预定房间(修改房间状态为已预订
    @Update("update room2 set status = 1 where id = #{id}")
    @Transactional
    void updateById(Room2 room2);

    //退房间(修改房间状态为未预定
    @Update("update room2 set status = 0 where id = #{id}")
    @Transactional
    void updateById2(Room2 room2);



//    @Update("update ")
}
