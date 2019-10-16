package com.howtodoinjava.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITIES")
public class Authorities {
  @Id
  @Column(name = "AUTHORITY")
  private String authority;

  @ManyToOne
  @JoinColumn(name = "USERNAME")
  private User users;

  //Getter and Setter methods

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
  
  
}