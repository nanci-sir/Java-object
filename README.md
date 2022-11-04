# Java-object
Java 面向对象知识回顾
package JavaBean;


##  1. 面向对象思想概述、类、对象

### 1.1 类

Java中要先定义类，才能创建对象；

类是相同事物共同特征的描述；对象是具体存在的实例；

建议一个Java文件建一个类；

类中可以定义的5大成分：**成员变量、构造器、成员方法**、代码块、内部类。

 修饰符 class 类名{

​         // 1、成员变量Field：描述类或者对象的属性信息，如：姓名、年龄。

​         // 2、成员方法Method: 描述类或者对象的行为的，如：唱歌、吃饭、买票。

​         // 3、构造器Constructor: 初始化一个类的对象返回。

​         // 4、内部类：**还没有学习。**

​         // 5、代码块：**还没有学习。**

```java
package classDemo;

public class Dog {
   private String name;
   private char sex;
   

public Dog() {
}

   public Dog(String name, char sex) {
      this.name = name;
      this.sex = sex;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public char getSex() {
      return sex;
   }

   public void setSex(char sex) {
      this.sex = sex;
   }
}
```

```java
package classDemo;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("徐超");
        d.setSex('公');
        System.out.println(d.getName());
        System.out.println(d.getSex());

    }
}
```

## 2. 构造器

### 2.1 **构造器**

初始化类的对象并返回对象的地址。

**构造器格式：**

修饰符 类名(形参列表){

 }

**初始化对象格式**

 类名 对象变量 = new 构造器;

### 2.2**构造器的分类和作用**

无参数构造器：初始化对象数据为默认值。

有参数构造器：可以在初始化对象的时候同时为对象的数据赋值。

```java
package constructor;

public class User {
    private String name;
    private  String longinName;
    private  String  passWord;
    private int age;
    //无参构造器

    public User() {
        System.out.println("无参构造器被执行");
    }

    //有参构造器

    public User(String name, String longinName, String passWord, int age) {
        this.name = name;
        this.longinName = longinName;
        this.passWord = passWord;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLonginName() {
        return longinName;
    }

    public void setLonginName(String longinName) {
        this.longinName = longinName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


```

```java
package constructor;

public class Test {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.getName());
        System.out.println(u.getAge());
        System.out.println(u.getPassWord());
        System.out.println(u.getLonginName());

        User u2 = new User("张三","ds","12121",12);
        System.out.println(u2.getName());
        System.out.println(u2.getAge());
        System.out.println(u2.getPassWord());
        System.out.println(u2.getLonginName());
    }
}
```

### 2.3 构造器的作用？

**初始化类的对象，并返回对象的地址。**

### 2.4 构造器有几种，各自的作用是什么？

**无参数构造器：初始化的对象时，成员变量的数据均采用默认值。**

**有参数构造器：在初始化对象的时候，同时可以为对象进行赋值。**

### 2.5 构造器有哪些注意事项？

任何类定义出来，默认就自带了无参数构造器，写不写都有。

**一旦定义了有参数构造器，无参数构造器就没有了，此时就需要自己写无参数构造器了。**

## 3. this关键字

### 3.1 作用：

出现在成员方法、构造器中代表当前对象的地址，用于指定访问当前对象的成员变量、成员方法。

this出现在构造器，或者方法中，哪个对象调用他们，this就代表哪个对象

在构造器中

```
package thisdemo;

import java.util.zip.GZIPOutputStream;

public class Car {
    private  String name;
    private double price;


    public Car (String name ,double price){
        this.name = name;
        this.price = price;


    }
    //this代表当前对象的地址
    public  void go(String name){
        System.out.println(this);
        System.out.println(this.name + "正在和" + name +"比赛");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

```

```java
package thisdemo;

public class Test {
    public static void main(String[] args) {
        Car c2 = new Car("宝马",5000);
        System.out.println(c2.getName());
        System.out.println(c2.getPrice());
        c2.go("奔驰");
        System.out.println(c2);//宝马正在和奔驰比赛
    }
}

```

**代表当前对象的地址，可以用于指定访问当前对象的成员变量、方法**

## 4. 面向对象三大特征之一：封装

### 4.1 面向对象的三大特征

：封装**、**继承、多态

封装基本思想：解决属性和方法属于哪个对象的问题。

封装步骤：通常将成员变量私有、提供方法进行暴露。

封装作用：提高业务功能设计的安全性，提高程序逻辑性和开发效率。

#### 4.2 **特征的含义：**

l所谓特征指的是已经成为Java设计代码的基本特点，即使毫无意义，通常也要需要满足这样的设计要求来编写程序。

```
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
```

```
package encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(-12);
        System.out.println(s.getAge());
    }
}
```

## 5. 标准 JavaBean

### 5.1 书写标准 JavaBean 必须满足如下要求：

也可以理解成实体类，其对象可以用于在程序中封装数据

成员变量使用 **private** 修饰。

提供每一个成员变量对应的 etXxx() /getXxx()

必须提供一个**无参构造器。**

```java
package JavaBean;

public class User {
    //私有封装
    private String name;
    private  double height;
    private  double salary;
    private double introduce;
//无参构造器
    public User() {
    }
//有参构造器
    public User(String name, double height, double salary, double introduce) {
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.introduce = introduce;
    }
//getset方法
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
```

```java
package JavaBean;

public class Test {
    public static void main(String[] args) {
        //对象封装信息
        User u1 = new User();
        u1.setName("张三");
        u1.setSalary(1000);
        u1.setHeight(160);
        u1.setIntroduce(21);
        System.out.println(u1.getHeight());
        System.out.println(u1.getIntroduce());
        System.out.println(u1.getName());
        System.out.println(u1.getSalary());

        User u2 = new User("李四",1000,10,12);
        System.out.println(u1.getHeight());
        System.out.println(u1.getIntroduce());
        System.out.println(u1.getName());
        System.out.println(u1.getSalary());


    }

}
```
