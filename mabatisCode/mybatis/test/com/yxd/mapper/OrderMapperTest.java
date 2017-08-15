package com.yxd.mapper;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.yxd.pojo.Order;

/**
 * @Title: OrderMapperTest.java
 * @Package com.yxd.mapper
 * @Description:
 * @author 杨旭东
 * @date 2017年8月10日 下午11:22:46
 * @version V1.0
 */
public class OrderMapperTest {
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
	public void testSlectUserFindOrders() throws Exception {
		SqlSession sqlSession= sqlSessionFactory.openSession();
		 OrderMapper orderMapper= sqlSession.getMapper(OrderMapper.class);
		 List<Order> order = orderMapper.slectUserFindOrders();
		 System.out.println(order.get(1).getUserEx().getUsername());
		 	Iterator<Order> iterator=  order.iterator();
		 	while(iterator.hasNext()) {
				System.out.println(iterator.next().getOrderPrice());
			}
		 sqlSession.close();
	}

}
