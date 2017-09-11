package day02.ognl;

import cn.wbz.entity.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 王炳智 on 2017/9/5.
 */
public class ValueStackgetObject extends ActionSupport {


    private User user = new User();

    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        user.setUsername("wbz");
        user.setPassword("321");
        user.setAddress("china");
        return "success";
    }
}
