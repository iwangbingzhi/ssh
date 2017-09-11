package day02.ognl;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 王炳智 on 2017/9/3.
 */
//从值栈中获取对象
public class ObjectDemo extends ActionSupport {
    //1 定义对象的变量
    private User user = new User();
    //2 生成get方法
    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        //3 向值栈user里面放数据
        user.setUsername("wangbingzhi");
        user.setPassword("123");
        user.setAddress("中国");
        return "success";
    }
}
