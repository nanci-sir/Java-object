package JavaBean;

public class User {
    private String name;
    private  double height;
    private  double salary;
    private double introduce;

    public User() {
    }

    public User(String name, double height, double salary, double introduce) {
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getIntroduce() {
        return introduce;
    }

    public void setIntroduce(double introduce) {
        this.introduce = introduce;
    }
}
