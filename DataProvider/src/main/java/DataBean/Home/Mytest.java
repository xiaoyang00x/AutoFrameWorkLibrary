package DataBean.Home;

import DataTool.DataFactory;

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
        // Mytest mytest = new Mytest();
        //
        // mytest.setAge(25);
        // mytest.setName("yangyu");
        // mytest.setSex("male");
        // mytest.setHomePageBean(DataFactory.GetData(HomePageBean.class));
        // InitYamlFileUtil.initYamlFile(mytest);
        Mytest mytest = DataFactory.GetData(Mytest.class);
        System.out.println(mytest);
    }

}
