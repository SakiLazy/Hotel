package com.hziee.hotel.Mapper;


import com.hziee.hotel.Bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    //查询，可以实现登录功能
    @Select("SELECT * FROM user WHERE name = #{name} AND password = #{password}")
    User getInfo(@Param("name") String name, @Param("password") String password);

    //增加，可以实现注册功能
    @Insert("insert into user(name,password,phone,email)values(#{name},#{password},#{phone},#{email})")
    void saveInfo(@Param("name") String name,
                  @Param("password") String password,
                  @Param("phone") String phone,
                  @Param("email") String email);

}
