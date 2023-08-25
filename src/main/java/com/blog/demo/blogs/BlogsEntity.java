package com.blog.demo.blogs;

import com.blog.demo.common.BaseEntity;
import com.blog.demo.users.UserEntity;
import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Entity(name="blogs")
public class BlogsEntity extends BaseEntity
{
    @Column(nullable = false, length = 150)
    String title;
    @Column(nullable = false, length = 150)
    String slug;
    @Column(nullable = false, length = 50)
    String subtitle;
    @Column(nullable = false, length = 5000)
    String body;

    @ManyToOne
    UserEntity author;
}
