package encapsulation;

public class Student {
    //私有的成员只能在本类中被访问
    private int age;

    //暴露
    //赋值找get
    public int getAge() {
        return age;
    }
     //取值找set
    public void setAge(int age) {
        if (age > 0 && age < 200) {
            this.age = age;
        } else {
            System.out.println("年龄不合法");
        }
    }
}