package com.blog.demo.comments;

import com.blog.demo.blogs.BlogsEntity;
import com.blog.demo.common.BaseEntity;
import com.blog.demo.users.UserEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Entity(name="comments")
public class CommentsEntity extends BaseEntity
{
    @Column(nullable = false,length = 150)
    String title;
    @Column(nullable = false,length = 500)
    String body;

    @ManyToOne
    UserEntity author;

    @ManyToOne
    BlogsEntity blog;
}
