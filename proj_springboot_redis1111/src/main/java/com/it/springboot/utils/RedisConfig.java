package com.it.springboot.utils;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author     ：zyx
 * @date       ：Created in 2020/11/10 16:08
 * @description：redis的配置类
 * @modified By：
 * @version:     $
 */
@Configuration
@EnableCaching
public class RedisConfig {

    @Bean
    public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory connectionFactory){

        RedisTemplate<String,String>  redisTemplate = new RedisTemplate<>();

        redisTemplate.setConnectionFactory(connectionFactory);

    return  redisTemplate;
    }

    //

   /* @Bean
    public RedisTemplate<String,String> redisTemplate(LettuceConnectionFactory connectionFactory){

        RedisTemplate<String,String>  redisTemplate = new RedisTemplate<>();

        redisTemplate.setConnectionFactory(connectionFactory);

        return  redisTemplate;
    }*/

}
