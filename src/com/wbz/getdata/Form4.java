package com.wbz.getdata;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 王炳智 on 2017/8/29.
 */
public class Form4 extends ActionSupport {
//使用属性封装获取表单数据  缺陷，只是获取表单数据到属性里面，不能把数据直接封赚到实体类里去


    //变量的名称和表单输入项name属性值一样
    private String username;
    private String password;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String execute() throws Exception {
        System.out.println(username+":"+password+":"+address);
        return NONE;
    }
}
