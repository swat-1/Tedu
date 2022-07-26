package day0726;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //发生"阻塞",等待用户输入数据,知道输入且回车为止
        //回车后,结束"阻塞",将输入值赋值给变量n
        int n = sc.nextInt();
        System.out.println(n);
    }
}
