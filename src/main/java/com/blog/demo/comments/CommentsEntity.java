package com.blog.demo.comments;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name="comments")
public class CommentsEntity
{
    @Id()
    //primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    // kind of autoincrement
    @Column(nullable = false)

    UUID id;
}
