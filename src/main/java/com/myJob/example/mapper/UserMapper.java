package com.myJob.example.mapper;

import com.myJob.example.entity.User;
import com.myJob.example.mapper.provider.UserProvider;
import org.apache.ibatis.annotations.*;

/**
 * @author: dxjx
 * @description:
 * @date: 2018/10/11
 */
@Mapper
public interface UserMapper {
    /*@Select("select * from user where name=#{name}")
    User findByName(@Param("name") String name);*/

    /*@Insert("insert into user(name,age) values (#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);*/


    @SelectProvider(type = UserProvider.class, method = "select")
    User findById(Long id);

    @InsertProvider(type = UserProvider.class, method = "insert")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
