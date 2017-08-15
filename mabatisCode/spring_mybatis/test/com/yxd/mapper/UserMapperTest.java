package com.yxd.mapper;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yxd.pojo.User;


/**
 * @Title: UserMapperTest.java
 * @Package com.yxd.mapper
 * @Description: 测试类
 * @author 杨旭东
 * @date 2017年8月10日 下午5:39:37
 * @version V1.0
 */
public class UserMapperTest {

	//spring容器获取的方法
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		String applcationContextResource = "classpath:spring/applicationContext-dao.xml";
		applicationContext = new ClassPathXmlApplicationContext(applcationContextResource);
	}

	@Test
	public void testSlectUserSpring() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = new User();
		user.setId(4);
		User user2 = userMapper.selectUser(user);
		System.out.println(user2);
	}
}
