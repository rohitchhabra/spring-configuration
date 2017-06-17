package com.basic.files;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

@Autowired
private LoginService loginService;

@RequestMapping(value="/login", method=RequestMethod.POST,consumes="application/json",produces="application/json")
public @ResponseBody UserDto login(@RequestBody UserDto userDto){
	UserDto response = new UserDto();
	try{
		response = loginService.login(userDto);
	}catch(Exception e){
		
		System.out.println(ExceptionUtils.getStackTrace(e));
	}
	return response;
}

}
