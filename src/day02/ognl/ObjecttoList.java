package day02.ognl;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王炳智 on 2017/9/5.
 */
public class ObjecttoList extends ActionSupport {
    public List<User> getList() {
        return list;
    }

    private List<User> list = new ArrayList<User>();
    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setAddress("中国");
        user.setPassword("6666");
        user.setUsername("zhangweijian");

        User user2 = new User();
        user2.setAddress("香港");
        user2.setPassword("6");
        user2.setUsername("zhangsanfeng");
        list.add(user);
        list.add(user2);
        return "success";
    }
}
