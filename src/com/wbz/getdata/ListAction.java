package com.wbz.getdata;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by 王炳智 on 2017/8/30.
 */
public class ListAction extends ActionSupport {

    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }



    @Override
    public String execute() throws Exception {
        System.out.println(list);
        return NONE;
    }
}
