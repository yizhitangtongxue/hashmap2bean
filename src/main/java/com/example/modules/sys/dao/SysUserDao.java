package com.example.modules.sys.dao;

import com.example.modules.common.entity.FromMap;


//mybatis @Mapper
public interface SysUserDao {

	// select * from sys_user where id = 1
	FromMap findUser();

}
