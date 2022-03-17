package demo1;

import demo1.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ln
 * @Date: 2022/3/17 16:38
 * @Description:
 */
public class Test {
    @org.junit.Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());

        User userp = context.getBean("userp", User.class);
        System.out.println(userp.toString());

        User usernull = context.getBean("usernull", User.class);
        System.out.println(usernull.toString());
    }

    @org.junit.Test
    public void stuTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu.toString());
    }

}
