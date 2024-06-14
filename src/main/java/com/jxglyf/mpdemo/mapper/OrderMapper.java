package com.jxglyf.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxglyf.mpdemo.entity.Order;
import com.jxglyf.mpdemo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    // Query all the order according to user's id
    @Select("SELECT * FROM t_order WHERE uid = #{uid}")
    List<Order> selectByUid(int uid);

    // Query all the orders and the users
    @Select("SELECT * FROM t_order")
    @Results(
            {
                    @Result(column = "id", property = "id"),
                    @Result(column = "order_time", property = "order_time"),
                    @Result(column = "total", property = "total"),
                    @Result(column = "uid", property = "user", javaType = User.class,
                    one=@One(select = "com.jxglyf.mpdemo.mapper.UserMapper.selectById"))
            }
            )
    List<Order> selectAllOrdersAndUser();


}
