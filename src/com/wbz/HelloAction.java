package com.wbz;

/**
 * Created by 王炳智 on 2017/8/25.
 */
public class HelloAction {
    /*
    * 1.访问action会默认执行execute方法
    * 2.配置action的访问路径（创建struts核心配置文件,名称和位置都是固定的，都必须在src下面，名称struts.xml）
    * 3.在配置文件中引入dtd约束,配置action
    * 4.web.xml配置过滤器
    *
    *
    * */
    public String execute(){
        System.out.println("action.............");
        return "none";
    }
}
