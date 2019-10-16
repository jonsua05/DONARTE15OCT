package com.howtodoinjava.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.demo.spring.dao.UserDao;
import com.howtodoinjava.demo.spring.model.User1;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   public void save(User1 user) {
      userDao.save(user);
   }

   @Transactional(readOnly = true)
   public List<User1> list() {
      return userDao.list();
   }

}
