package com.howtodoinjava.demo.spring.service;

import java.util.List;

import com.howtodoinjava.demo.spring.model.User1;

public interface UserService {
   void save(User1 user);

   List<User1> list();
}
