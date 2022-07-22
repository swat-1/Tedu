package day0722;

public class Demo03 {
    public static void main(String[] args) {
        //常见面试题:
        short s = 5;
        //s = s+10; //编译错误，需强转，改为: s=(short)(s+10);
        s += 10; //相当于: s=(short)(s+10);

        /*1)语法:
        boolean?数1:数2
        2)执行过程:
        整个表达式是有值的，它的值要么是?号后的数1，要么是:号后的数2
        计算boolean的值:
        若为true，则整个表达式的结果为?号后的数1
        若为false，则整个表达式的结果为:号后的数2*/
        int num = 0;
        int flag = num < 0 ? 1 : -1;
        System.out.println(flag);
        int a = 65, b = 59;
        int max = a<b?b:a;
        System.out.println(max);
    }
}