package com.it.springboot.service;
import com.it.springboot.dao.UserDAO;
import com.it.springboot.entry.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    UserDAO userDAO;

    @Override
    public User getUserById(Integer id) {
        return userDAO.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void delUser(User user) {
        userDAO.delete(user);
    }

    @Override
    public User findUserById(User user) {
        return userDAO.getOne(user.getId());
    }

    @Override
    public void updateUser(User user) {
        userDAO.saveAndFlush(user);
    }
}
