package demo1;

/**
 * @Author: ln
 * @Date: 2022/3/17 17:09
 * @Description: 有参构造函数注入
 */
public class Stu {
    private String sname;
    private String ssax;

    public Stu(String sname, String ssax){
        this.sname = sname;
        this.ssax = ssax;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sname='" + sname + '\'' +
                ", ssax='" + ssax + '\'' +
                '}';
    }
}
