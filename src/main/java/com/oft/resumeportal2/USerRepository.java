package com.oft.resumeportal2;

import com.oft.resumeportal2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface USerRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String userName);
}
