package day0726;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //根据年份数判断是否是闰年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int Number = sc.nextInt();
        //四年一闰,百年不闰,四百年再闰,三千两百年不闰
        //if else 法
/*        if (((Number % 4 == 0) && (Number % 100 != 0)) || (Number % 400 == 0)) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        } */
        boolean flag = (Number % 4 == 0 && (Number % 100 != 0)) || (Number % 400 == 0);
        System.out.println(flag);
    }
}
