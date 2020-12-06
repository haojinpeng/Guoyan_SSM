package com.it.springboot.dao;

import com.it.springboot.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
}
