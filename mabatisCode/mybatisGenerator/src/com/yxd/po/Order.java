package com.yxd.po;

public class Order {
    private Integer orderid;

    private String ordername;

    private String orderprice;

    private Integer userid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public String getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(String orderprice) {
        this.orderprice = orderprice == null ? null : orderprice.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}