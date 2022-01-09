package com.learning.jpa.jpaExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.jpa.jpaExample.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
}
