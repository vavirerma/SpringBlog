package com.blog.demo.users;


import jakarta.persistence.*;

import java.util.UUID;

@Entity(name="users")
public class UserEntity {
    @Id()
    //primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    // kind of autoincrement
    @Column(nullable = false)

    UUID id;

}
