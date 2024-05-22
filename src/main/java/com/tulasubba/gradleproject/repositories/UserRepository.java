package com.tulasubba.gradleproject.repositories;

import com.tulasubba.gradleproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    List<User> findAll();

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User findUsernameByUsername(@Param("username") String username);

}
