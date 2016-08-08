package DataBean.Home;

import DataBean.OpromoterBean;
import DataTool.InitYamlFileUtil;

public class Mytest {

    private String name;
    private String sex;
    private int age;
    private HomePageBean homePageBean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HomePageBean getHomePageBean() {
        return homePageBean;
    }

    public void setHomePageBean(HomePageBean homePageBean) {
        this.homePageBean = homePageBean;
    }

    public static void main(String[] args) {
        OpromoterBean opromoterBean = new OpromoterBean("tester", "612657189910110389", "19100000012",
                "test@jiedaibao.com", "北京", "沙河", "cooperSource");
        InitYamlFileUtil.initYamlFile(opromoterBean);

    }

}
