package com.jxglyf.mpdemo.mapper;

import com.jxglyf.mpdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    // Query all the user
    @Select("SELECT * FROM user")
    public List<User> find();

}
