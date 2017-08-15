package com.yxd.mapper;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.yxd.pojo.User;
import com.yxd.pojo.UserEx;


/**
 * @Title: UserMapperTest.java
 * @Package com.yxd.mapper
 * @Description: 测试类
 * @author 杨旭东
 * @date 2017年8月10日 下午5:39:37
 * @version V1.0
 */
public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		// mybatis配置文件
		String resource = "mybatis/SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 使用SqlSessionFactoryBuilder创建sessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testSlectUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setId(3);
		User user2 = userMapper.selectUser(user);
		System.out.println(user2);
		sqlSession.close();
	}
	@Test
	public void testInsertUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setUsername("李彦宏");
		user.setPassword("100");
		user.setEmill("234234234@qq.com");
		userMapper.insertUser(user);
		System.out.println(user);
		sqlSession.commit();
		sqlSession.close();
	}
}
