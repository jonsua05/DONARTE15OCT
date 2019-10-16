package com.howtodoinjava.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "TBL_User")
public class User1 {

   @Id
   @Column(name = "USER_ID")
   private Long id=0L;

   @Column(name = "USER_NAME")
   @Size(max = 20, min = 3, message = "{user.name.invalid}")
   @NotEmpty(message="Ingrese su nombre")
   private String name;

   @Column(name = "USER_EMAIL", unique = true)
   @Email(message = "{user.email.invalid}")
   @NotEmpty(message="Ingrese su contraseña")
   private String email;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}




