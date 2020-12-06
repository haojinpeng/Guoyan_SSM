package com.it.springboot.controller;

import com.it.springboot.entry.Users;
import com.it.springboot.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//mybaits
@RestController
@RequestMapping("/users")
public class UsersController {
    @Resource
    private UsersService usersService;

    @GetMapping("findAll")
    public List<Users> findAll(){
        List<Users> usersList = null;
        try {
            usersList = usersService.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return usersList;
    }
}
