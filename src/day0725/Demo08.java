package day0725;

public class Demo08 {
    public static void main(String[] args) {
        int n = 5;
        n++;//后加或者叫先取值,后增加
        //先取n的值为n++整体表达式的值为5,后n增加1为6
        System.out.println(n);
        n = 5;
        n--;
        System.out.println(n);
        n = 5;
        ++n;//先增加,再取值
        //先将n增加1再将增加1后的6赋值给n
        System.out.println(n);
        n = 5;
        --n;
        System.out.println(n);
        //坑人题目,n1变化两次,一次变为9后变为8
        int n1 = 8;
        n1 = n1++;
        System.out.println(n1);


        int n2 = 8;
        n2 = ++n2;
        System.out.println(n2);
    }
}
