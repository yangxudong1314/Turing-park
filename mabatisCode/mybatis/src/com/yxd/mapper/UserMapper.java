package com.yxd.mapper;
import com.yxd.pojo.User;
import com.yxd.pojo.UserEx;

/**
 * @Title: UserMapper.java
 * @Package com.yxd.mapper
 * @Description: user的接口
 * @author 杨旭东
 * @date 2017年8月10日 下午5:18:29
 * @version V1.0
 */
public interface UserMapper {
	//查询用户
	public User selectUser(User user) throws Exception;
	//插入用户
	public void insertUser(User user) throws Exception;
}
