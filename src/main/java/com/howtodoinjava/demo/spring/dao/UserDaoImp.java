package com.howtodoinjava.demo.spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.spring.model.User1;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void save(User1 user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   public List<User1> list() {
      @SuppressWarnings("unchecked")
      TypedQuery<User1> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

}
