package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "post")
@Data // take care of getters & setters etc
public class Post {
    
    @Id
    Long id;
    
    long userId;
    
    String title;
    
    @Lob
    @Column(columnDefinition = "text")
    // Stringi text olarak algılaması için oksa varchar(255)
    String text;

}
