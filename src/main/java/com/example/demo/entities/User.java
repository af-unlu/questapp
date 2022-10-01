package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// anotasyon yardımıyla kod üretme kütüphanesi
// getter ve setter leri halledecek
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
    
    @Id
    Long id;

    String userName;
    String password;
}
