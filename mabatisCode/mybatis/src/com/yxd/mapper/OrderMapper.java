package com.yxd.mapper;
import java.util.List;

import com.yxd.pojo.Order;

/**
 * @Title: UserMapper.java
 * @Package com.yxd.mapper
 * @Description: user的接口
 * @author 杨旭东
 * @date 2017年8月10日 下午5:18:29
 * @version V1.0
 */
public interface OrderMapper {
	//通过用户查找商品
	public List<Order> slectUserFindOrders()throws Exception;
}
