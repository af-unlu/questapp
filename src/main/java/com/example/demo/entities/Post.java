package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "post")
@Data // take care of getters & setters etc
public class Post {
    
    @Id
    Long id;
    
    // many post one user
    // fetch type lazy : post objesi geldiginde ilgili useri bana getirme
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false) // foreign key
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore //dont serialize in json
    User user;
    
    String title;
    
    @Lob
    @Column(columnDefinition = "text")
    // Stringi text olarak algılaması için oksa varchar(255)
    String text;

}
