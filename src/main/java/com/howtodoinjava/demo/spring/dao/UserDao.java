package com.howtodoinjava.demo.spring.dao;

import java.util.List;

import com.howtodoinjava.demo.spring.model.User1;

public interface UserDao {
   void save(User1 user);
   List<User1> list();
}
