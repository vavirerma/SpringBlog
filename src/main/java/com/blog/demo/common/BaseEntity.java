package com.blog.demo.common;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity
{
    @Id()
    //primary key
    @GeneratedValue(strategy = GenerationType.UUID)
    // kind of autoincrement
    @Column(nullable = false)

    UUID id;
    @CreatedDate
    @Column(nullable = false)
    Date createdAt;
}
