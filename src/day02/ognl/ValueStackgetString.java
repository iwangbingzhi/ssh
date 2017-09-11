package day02.ognl;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 王炳智 on 2017/9/5.
 */
//从值栈中获取字符串（不常用）
public class ValueStackgetString extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }


    @Override
    public String execute() throws Exception {
        username = "wangbingzhi";
        return "success";
    }
}
