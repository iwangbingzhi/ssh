package com.wbz.method;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 王炳智 on 2017/8/28.
 */


//创建action，创建多个方法
public class BookAction extends ActionSupport{
    //添加
    public String add(){
        System.out.println("add.........");
        return NONE;
    }

    //删除
    public String update(){
        System.out.println("update.......");
        return NONE;
    }


}
