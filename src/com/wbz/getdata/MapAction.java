package com.wbz.getdata;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by 王炳智 on 2017/8/30.
 */
public class MapAction extends ActionSupport {
    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    private Map<String ,User> map;
    @Override
    public String execute() throws Exception {
        System.out.println(map);
        return "none";
    }
}
