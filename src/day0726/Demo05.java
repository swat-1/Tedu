package day0726;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println("请输入购买数量");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        double discount = 0;
        if (quantity > 1 && quantity < 10) {
            discount = 14.06;
        } else if (quantity >= 10 && quantity < 30) {
            discount = 12.64;
        } else if (quantity >= 30 && quantity < 100) {
            discount = 11.64;
        } else if (quantity >= 100 && quantity < 500) {
            discount = 10.0464;
        } else if (quantity >= 500 && quantity < 1000) {
            discount = 9.5772;
        } else if (quantity >= 1000) {
            discount = 9.384;
        }
        double totalPrice = quantity*discount;
        System.out.println("价格为:" + totalPrice);
    }
}
