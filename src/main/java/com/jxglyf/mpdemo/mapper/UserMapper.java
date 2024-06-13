package com.jxglyf.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxglyf.mpdemo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    // Query all the user
//    @Select("SELECT * FROM user")
//    public List<User> find();
//
//    // Insert one user
//    @Insert("INSERT INTO user VALUES (#{id}, #{username}, #{password}, #{birthday})")
//    public int insert(User user);
//
//    // Update one user
//    @Update("UPDATE user SET username = #{username}, password = #{password}, birthday = #{birthday} WHERE id = #{id}")
//    public int update(User user);
//
//    // Delete the user
//    @Delete("DELETE FROM user WHERE id = #{id}")
//    public int delete(int id);
//
//    // Get the user
//    @Select("SELECT * FROM user WHERE id = #{id}")
//    public User findById(int id);

}
