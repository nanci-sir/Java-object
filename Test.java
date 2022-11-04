package thisdemo;

public class Test {
    public static void main(String[] args) {
        Car c2 = new Car("宝马",5000);
        System.out.println(c2.getName());
        System.out.println(c2.getPrice());
        c2.go("奔驰");
        System.out.println(c2);
    }
}
