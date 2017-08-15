package com.yxd.pojo;

/**
 * @Title: Order.java
 * @Package com.yxd.pojo
 * @Description:  订单商品信息表
 * @author 杨旭东
 * @date 2017年8月10日 下午10:31:51
 * @version V1.0
 */
public class Order {
	private Integer orderId;
	private String orderName;
	private String orderPrice;
	private UserEx userEx;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public UserEx getUserEx() {
		return userEx;
	}

	public void setUserEx(UserEx userEx) {
		this.userEx = userEx;
	}



}
