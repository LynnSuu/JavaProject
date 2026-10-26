package Lesson4;
import java.util.Scanner;//1.导入包，创建一个监视器
public class Test1 {
    public static void main(String[] args) {
        //2.创建扫描器，监视键盘的输入
        //如果不输入的话，会“阻塞”
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个整数：");

        
        //3.获取键盘输入的整数，存入变量a中
        int a =input.nextInt();
        System.out.println("你刚刚输入的是"+a);


    }
}
