package day0725;

public class Demo06 {
    public static void main(String[] args) {
        int n = 5;
        n = n + 6;
        System.out.println(n);
        //赋值表达式有值,是赋值的值
        System.out.println(n = 18);
        System.out.println(n);
        int m = 5 + (n = 10) * 8;
        System.out.println(m);
    }
}
