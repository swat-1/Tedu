package day0726;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总价");
        double price = sc.nextInt();
        if (price > 500) {
            price *= 0.8;
            System.out.println("打八折");
        } else {
            price *= 0.95;
            System.out.println("打95折");//打桩语句
        }
        System.out.println("到手价"+price);
    }
}
