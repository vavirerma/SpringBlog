package com.blog.demo.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UsersRepsitory extends JpaRepository<UserEntity, UUID>
{
    UserEntity findByUsername(String username);
    UserEntity findByEmail(String email);
}
