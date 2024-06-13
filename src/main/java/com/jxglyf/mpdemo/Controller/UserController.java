package com.jxglyf.mpdemo.Controller;

import com.jxglyf.mpdemo.entity.User;
import com.jxglyf.mpdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/query")
    public List<User> query(){

        List<User> list = userMapper.selectList(null);
        System.out.println(list);
        return list;

    }

    @PostMapping("/user/save")
    public String save(User user){

        int i = userMapper.insert(user);
        System.out.println(user);

        if(i > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    @PostMapping("/user/update")
    public String update(User user){
        int i = userMapper.updateById(user);
        if(i > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    @PostMapping("/user/delete")
    public String delete(int id){
        int i = userMapper.deleteById(id);
        if(i > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    @GetMapping("user/find/{id}")
    public String find(@PathVariable int id){
        User user = userMapper.selectById(id);
        return user.toString();
    }
}
