package day0722;

public class Demo03 {
    public static void main(String[] args) {
        /*//常见面试题:
        short s = 5;
        //s = s+10; //编译错误，需强转，改为: s=(short)(s+10);
        s += 10; //相当于: s=(short)(s+10);

        *//*1)语法:
        boolean?结果1:结果2
        2)执行过程:
        整个表达式是有值的，它的值要么是?号后的结果1，要么是:号后的结果2
        计算boolean的值:
        若为true，则整个表达式的结果为?号后的结果1
        若为false，则整个表达式的结果为:号后的结果2*//*
        int num = 0;
        int flag = num < 0 ? 1 : -1;
        //System.out.println(flag);
        int a = 65, b = 59;
        int max = a < b ? b : a;
        //System.out.println(max);
        //对两个数判断能极大缩短代码量*/

        int num = 1;
        while (num <= 9) {
            System.out.println(num + "*9=" + num * 9);
            num += 1;
        }
        System.out.println("继续执行...");

        int times = 0;  //1)循环变量的初始化
        while (times < 5) { //2)循环的条件
            System.out.println("行动是成功的阶梯");
            times++;    //3)循环变量的改变
        }
        System.out.println("继续执行...");
        /* 执行过程:
                       times=0
            true  输出  times=1
            true  输出  times=2
            true  输出  times=3
            true  输出  times=4
            true  输出  times=5
            false while循环结束
            输出继续执行...
        */
    }
}
