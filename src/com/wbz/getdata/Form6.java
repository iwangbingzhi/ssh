package com.wbz.getdata;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 王炳智 on 2017/8/30.
 */
//表达式封装
public class Form6 extends ActionSupport {
    //声明实体类
    private User user;
    //生成实体类的get set方法
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return "none";
    }
}
