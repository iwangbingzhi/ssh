package com.wbz.getdata;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;


/**
 * Created by 王炳智 on 2017/8/29.
 */
public class Form1 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        //第一种方式，使用actioncontext获取
        //1 获取actioncontext的对象
        ActionContext ctx = ActionContext.getContext();
        //2调用方法得到表单数据
        Map<String, Object> map = ctx.getParameters();
        Set<String> keys = map.keySet();
        for(String key : keys){
            Object[] obj = (Object[]) map.get(key);
            System.out.println(Arrays.toString(obj)); //选择arrays的原因是因为表单有复选框的情况
        }
        return NONE;
    }
}
