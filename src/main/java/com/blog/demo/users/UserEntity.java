package com.blog.demo.users;


import com.blog.demo.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;
;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Entity(name="users")
public class UserEntity extends BaseEntity
{
    @Column(nullable = false,unique = true,length = 30)
    String Username;
    @Column(nullable = false,unique = true,length = 50)
    String Email;
    @Column(nullable = false,length = 100)
    String Password;
    @Column(length = 100)
    String Bio;

}
