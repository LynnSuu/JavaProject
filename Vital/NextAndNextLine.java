//nextline:调用nextLine()方法从键盘输入中接收一整行字符串
//next：调用next()方法从键盘输入中接收一个字符串，遇空格结束

package Vital;
import java.util.Scanner;

public class NextAndNextLine {
    public static void main(String [] args) {
        Scanner input=new Scanner(System.in);//创建一个名为input的Scanner对象
        System.out.print("请输入一个有空格的字符串，回车结束：");
        String str1=input.nextLine();//调用nextLine()方法从键盘输入中接收一整行字符串
        System.out.println("你输入的字符串是："+str1);
        System.out.print("再次输入一个有空格的字符串，回车结束：");
        String str2=input.next();//调用next()方法从键盘输入中接收一个字符串，遇空格结束
        System.out.println("你输入的字符串是："+str2);
    
    }
}
