package day02.ognl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * Created by 王炳智 on 2017/8/31.
 */
//每个action对象中只有一个值栈
public class UserAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        //调用得到值栈对象
        ValueStack stack1 = ctx.getValueStack();
        ValueStack stack2 = ctx.getValueStack();
        System.out.println(stack1 == stack2);
        return NONE;
    }
}
