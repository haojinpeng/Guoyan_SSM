package com.it.springboot.test;

import com.it.springboot.MySpringBootApplication;
import com.it.springboot.entry.Users;
import com.it.springboot.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

//测试junit
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class )
public class UsersTest {
    @Resource
    UsersService usersService;

    @Test
    public void findAll(){
        List<Users> usersList = null;
        try {
            usersList = usersService.findAll();
            for (Users users:usersList
            ) {
                System.out.println(users);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
