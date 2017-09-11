package day02.ognl;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王炳智 on 2017/9/5.
 */
//从值栈中获取list数据
public class ValueStackgetList extends ActionSupport {


    public List<User> getList() {
        return list;
    }

    private List<User> list = new ArrayList<User>();
    @Override
    public String execute() throws Exception {
        User user1 = new User();
        user1.setUsername("wbz");
        user1.setPassword("321");
        user1.setAddress("china");

        User user = new User();
        user.setUsername("wangbingzhi");
        user.setPassword("66666666");
        user.setAddress("china");

        list.add(user);
        list.add(user1);

        return "success";
    }
}
