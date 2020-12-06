package com.it.springboot.controller;

import com.it.springboot.pojo.User;
import com.it.springboot.service.RedisService;
import com.it.springboot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final String key = "userCache_";

    @Resource
    UserService userService;
    @Resource
    RedisService redisService;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable String id){
        System.out.println("-----/getUser/{id}---->"+id);
        User user = null;
        try {
            user = userService.find(id);
            return user;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    @GetMapping("/getUserCache2/{id}")
    public User getUserCache2(@PathVariable String id){
        //step1 先从redis里面取值
        User user = (User) redisService.get(key+id);
        System.out.println("----fresh value from redis id:" + user);
        //step2 如果拿不到则从DB取值
        if (user == null){
            user = userService.find(id);
            System.out.println("----fresh value from DB id:" + user);
            //step3 DB非空情况刷新redis值
            if (user != null){
                //设置了过期时间 单位是秒
                redisService.set(key+id,user,100L);
                return user;
            }
        }
        return user;
    }

    //设置过去时间
    @GetMapping("/testRedis")
    public String testRedis(String key,String value){
        System.out.println("key-->"+key);
        System.out.println("value-->"+value);
        redisService.set(key,value,100L);
        return redisService.get(key).toString();
    }

    /**
     * redis作为二级缓存查询单个
     * @param id
     * @return
     */
    @GetMapping("/getUserCache3/{id}")
    public User getUserCache3(@PathVariable String id){
        System.out.println("-----------/getUserCache3/{id}----id->"+id);
        User user = userService.find(id);
        return user;
    }

    /**redis作为二级缓存修改
     *  1 先修改
     2 浏览器返回
     3 查看redis同步
     */
    @RequestMapping("/getUpdate/{id}/{name}")
    public User getUpdate(@PathVariable  String id,@PathVariable String name) {
        System.out.println("----/getUpdate---id->"+id+",name->"+name);
        User user = new User();
        user.setId(id);
        user.setUserName(name);
        user = userService.update(user);
        return user;
    }
}
