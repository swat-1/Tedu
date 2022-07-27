package day0726;

import sun.management.Agent;

public class Demo09 {
    public static void main(String[] args) {
        int age = 8;
        if(age == 8){
            int time =5;
            System.out.println(time);
            //int times = 9; //同一个作用域中不能重复定义变量
        }
        //int age = 10; 同一个作用域中不能重复定义变量
        if (age < 7){
            int times = 10;
            System.out.println(times);
            System.out.println(age);
        }
        int k=9;
        System.out.println(k);
    }
}