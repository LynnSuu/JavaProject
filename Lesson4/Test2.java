package Lesson4;
//包声明
import java.util.Scanner;
//或者写import java.util.*;
// import 语句必须写在 package 之后、class 之前，不能塞在方法里
//import是关键字：我要用下面的类
//Java.util是包名：相当于文件夹
//Scanner：要用的类
//意即：从Java.util这个包里，把Scanner这个类引进来，让下面的代码可以直接写Scanner
//Java 的类按包分类存放，只有 java.lang 包里的（String、System、Math）可以免费用，
// 其他包的类都得先 import。不写就报"找不到符号 Scanner
public class Test2 {
    //public权限：谁都能访问
    //static静态:不用创建对象就能直接跑
    //void无返回值
    //String[] args命令行参数
    //有两个大括号：1收main方法，2收class类
    public static void main(String[] args) {
        //void:是方法的返回值类型
        Scanner input=new Scanner(System.in);
        System.out.print("姓名：");
        String name=input.nextLine();
        
        System.out.print("年龄：");
        int age=input.nextInt ();

        System.out.print("身高：");
        double height=input.nextDouble();
        
        input.nextLine();
        //读到回车为止，可以读带空格的一整行

        System.out.print("爱好：");
        String hobby=input.nextLine();

        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("身高："+height);
        System.out.println("爱好："+hobby);

        input.close();
        //把 input 这个对象关掉，释放它占用的资源。
        //close:方法的名字
    }
}
