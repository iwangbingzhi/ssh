package com.wbz.getdata;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by 王炳智 on 2017/8/30.
 */
//使用模型驱动的方式获取表单数据(重点) 不能同时使用模型驱动和属性封装，同时使用只会执行模型驱动
public class Form5 extends ActionSupport implements ModelDriven<User>{
    //创建对象 表单输入项的name属性值和实体类属性名称一样
    private User user = new User();


    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return NONE;
    }

    @Override
    public User getModel() {
        //返回创建的user对象
        return user;
    }
}

