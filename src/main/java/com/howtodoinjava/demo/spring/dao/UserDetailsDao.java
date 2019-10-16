
package com.howtodoinjava.demo.spring.dao;
import com.howtodoinjava.demo.spring.model.User;

public interface UserDetailsDao {
  User findUserByUsername(String username);
}
