package com.example.modules.sys.controller;

import com.example.modules.common.entity.FromMap;
import com.example.modules.sys.dao.SysUserDao;
import com.example.modules.sys.mapper.TestUserMapper;
import com.example.modules.sys.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sys/user")
// swagger @Api(tags = "系统用户")
public class SysUserController {

	@Autowired
	private SysUserDao sysUserDao;

	@GetMapping("/test")
	public void test(){
		FromMap user = sysUserDao.findUser();
		TestVo testVo = TestUserMapper.INSTANCE.fromMap(user);
//		Source s = new Source(user);
//		TestVo testVos = new TestVo();
//		TestUserMapper.INSTANCE.updateTestVo(testVos,user);
		System.out.println(testVo);
	}
}
