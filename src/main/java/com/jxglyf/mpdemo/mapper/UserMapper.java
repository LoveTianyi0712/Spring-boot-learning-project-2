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

    // Query user information according the id: SELECT * FROM user WHERE id =
    @Select("SELECT * FROM t_user WHERE id = #{id}")
    User selectById(int id);

    // Query user and all of its orders
    @Select("SELECT * FROM t_user")
    @Results(
            {
                    @Result(column = "id", property = "id"),
                    @Result(column = "username", property = "username"),
                    @Result(column = "password", property = "password"),
                    @Result(column = "birthday", property = "birthday"),
                    @Result(column = "id", property = "orders", javaType = List.class,
                            many=@Many(select = "com.jxglyf.mpdemo.mapper.OrderMapper.selectByUid")
                    )

            }
    )
    List<User> selectAllUserAndOrders();

}
