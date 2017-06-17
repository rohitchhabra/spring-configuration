package com.basic.files;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.basic.Entity.User;

@Service
@Transactional
public class LoginServiceimpl implements LoginService{

	//@Autowired
	//private UserRepository userRepository;
	
	/*public void setUserDaoImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}*/

	@Override
	public UserDto login(UserDto userDto) throws Exception {
		UserDto response = new UserDto();
		String email=userDto.getEmail();
		String password = userDto.getPassword();
		/*if(email == null || password == null || email.equals(null) || password.equals(null)){
			response.setResponseCode("104");
			response.setResponseDesc("Username & password can't be blank");
			return response;
		}*/
		//User user = (User) baseDaoImpl.findWithNamedQueries("user.findByEmailAndPassword", User.class, queryParams);
		User user = new User();//(User) userRepository.findUserByEmailAndPassword(email,password);
		/*if(user==null){
			response.setResponseCode("103");
			response.setResponseDesc("Username & password does not match");
			return response;
		}*/
		userDto = new UserDto();
		userDto.setEmail(user.getEmail());
		userDto.setMobileNo(user.getMobileNo());
		userDto.setName(user.getName());
		
		
		return response;
	}

}
