package Vital.Project2;

public class Test2 {
    public static void main(String[] args) {
        int i=60555;
        int j=60341;
        System.out.println("交换前：i="+i+",j="+j);
        int temp=0;
        temp=i;
        i=j;
        j=temp;
        System.out.println("交换后：i="+i+",j="+j);
    }
}
