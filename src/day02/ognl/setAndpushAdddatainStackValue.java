package day02.ognl;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王炳智 on 2017/9/6.
 */
public class setAndpushAdddatainStackValue extends ActionSupport {
    private List<User> list = new ArrayList<User>();

    public List<User> getList() {
        return list;
    }

    @Override
    public String execute() throws Exception {
        User user1 = new User();
        user1.setUsername("小奥");
        user1.setPassword("123");
        user1.setAddress("美国");

        User user2 = new User();
        user2.setUsername("小王");
        user2.setPassword("250");
        user2.setAddress("越南");

        list.add(user1);
        list.add(user2);
        return "success";
    }
}
