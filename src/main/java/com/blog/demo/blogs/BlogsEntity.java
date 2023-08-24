package com.blog.demo.blogs;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name="blogs")
public class BlogsEntity
{
    @Id()
    //primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    // kind of autoincrement
    @Column(nullable = false)

    UUID id;
}
