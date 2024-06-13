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
    public List query(){

        List<User> list = userMapper.find();
        System.out.println(list);
        return list;

    }

    @PostMapping("/user/save")
    public String save(User user){

        int i = userMapper.insert(user);
        if(i > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    @PostMapping("/user/update")
    public String update(User user){
        int i = userMapper.update(user);
        if(i > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    @PostMapping("/user/delete")
    public String delete(int id){
        int i = userMapper.delete(id);
        if(i > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    @GetMapping("user/find/{id}")
    public String find(@PathVariable int id){
        User user = userMapper.findById(id);
        return user.toString();
    }
}
