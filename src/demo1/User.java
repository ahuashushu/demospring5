package demo1;

/**
 * @Author: ln
 * @Date: 2022/3/17 16:35
 * @Description: set方法注入属性
 */
public class User {
    private String uname;

    public void setUage(String uage) {
        this.uage = uage;
    }

    private String uage;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }

    public User(String uname){
        this.uname = uname;
    }

    public User(){

    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
