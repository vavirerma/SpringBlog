package com.blog.demo.Users;


import com.blog.demo.users.UserEntity;
import com.blog.demo.users.UsersRepsitory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.UUID;

@DataJpaTest
public class UserRepositoryTest
{
    @Autowired private UsersRepsitory usersRepsitory;
    @Test
    public void createUser(){
        UserEntity userEntity=new UserEntity(
                "TestUser",
                "TestUser@gmail.com",
                "TestPassword",
                "TestBio");
        userEntity.setId(UUID.randomUUID());
        userEntity.setCreatedAt(new Date());
        var user=usersRepsitory.save(userEntity);
        Assertions.assertNotNull(user.getId());

    }
    @Test
    public void findByUsername() {
        UserEntity userEntity = new UserEntity(
                "testuser",
                "testemail@gmail.com",
                "testpassword",
                "testbio"
        );

        usersRepsitory.save(userEntity);
        var user = usersRepsitory.findByUsername("testuser");
        System.out.println(user);
        Assertions.assertEquals("testemail@gmail.com", user.getEmail());
    }


}
