package com.wbz.getdata;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 王炳智 on 2017/8/29.
 */

//原始方式实现表单封装实体类对象
public class Form3 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);
        System.out.println(user);
        return NONE;
    }
}
