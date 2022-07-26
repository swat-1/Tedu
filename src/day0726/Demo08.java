package day0726;

import sun.print.SunMinMaxPage;

public class Demo08 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
