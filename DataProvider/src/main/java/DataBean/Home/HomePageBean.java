package DataBean.Home;

public class HomePageBean {
    private int age;
    private String name;
    private String sex;

    public HomePageBean() {
    }

    public HomePageBean(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public static void main(String[] args) {
        System.out.println(HomePageBean.class.getResource(""));
        System.out.println(HomePageBean.class.getName().replace(".", "/").replace("DataBean", "Yaml"));
        System.out.println(HomePageBean.class.getClassLoader().getResource(""));

    }
}
