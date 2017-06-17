package com.basic.files;

import com.basic.Entity.User;

//@Repository
public interface UserRepository { //extends JpaRepository<User, Integer>
 //import com.googlecode.genericdao.dao.hibernate.GenericDAO;
	//extends GenericDAO<Account, Long>
	
	User findUserByEmailAndPassword(String email,String password);
}
