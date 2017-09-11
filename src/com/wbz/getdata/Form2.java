package com.wbz.getdata;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 王炳智 on 2017/8/29.
 */
public class Form2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
     /*HttpServletRequest request =  ServletActionContext.getRequest();
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       String address = request.getParameter("address");
       System.out.println(username +":"+ password +":"+ address);*/

        //操作三个域对象
        HttpServletRequest request =  ServletActionContext.getRequest();
        //request域对象
        request.setAttribute("req","hello");

        //sesssion域对象
        HttpSession session = request.getSession();
        session.setAttribute("sess","sessValue");

        //servletContext域 （不常用）
        ServletContext ctx = ServletActionContext.getServletContext();
        ctx.setAttribute("ctxname","ctxValue");
        return NONE;
    }
}
