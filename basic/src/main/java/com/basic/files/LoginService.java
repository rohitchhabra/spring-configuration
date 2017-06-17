package com.basic.files;

import com.basic.Entity.User;

public interface LoginService {

	UserDto login(UserDto userDto) throws Exception;
}
