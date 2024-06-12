package com.jxglyf.mpdemo.mapper;

import com.jxglyf.mpdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    // Query all the user
    @Select("SELECT * FROM user")
    public List<User> find();

    // Insert one user
    @Insert("INSERT INTO user VALUES (#{id}, #{username}, #{password}, #{birthday})")
    public int insert(User user);

}
