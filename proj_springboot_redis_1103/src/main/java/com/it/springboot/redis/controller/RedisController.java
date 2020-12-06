package com.it.springboot.redis.controller;
//springboot和redis集成

import com.it.springboot.redis.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {
    @Resource
    RedisTemplate redisTemplate;
    @Resource
    RedisService redisService;

    @GetMapping("/testRedis")
    public Object testRedis(String key,String val){
        System.out.println("key-->"+key);
        System.out.println("val-->"+val);
        redisTemplate.opsForValue().set(key,val);
        return redisTemplate.opsForValue().get(key);
    }

    @GetMapping("/testRedis2")
    public Object testRedis2(String key,String val){
        System.out.println("------testRedis2------------");
        System.out.println("key-->"+key);
        System.out.println("val-->"+val);
        redisService.set(key,val);
        return redisService.get(key);
    }
}
