package com.hziee.hotel.Mapper;


import com.hziee.hotel.Bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE name = #{name} AND password = #{password}")
    User getInfo(@Param("name") String name, @Param("password") String password);

    @Insert("insert into user(name,password,phone,email)values(#{name},#{password},#{phone},#{email})")
    void saveInfo(@Param("name") String name,
                  @Param("password") String password,
                  @Param("phone") String phone,
                  @Param("email") String email);

    @Select("select * from user")
    List<User> findAll();
}
