package com.basic.files;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basic.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findUserByEmailAndPassword(String email,String password);
}
