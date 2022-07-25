package day0725;

public class Demo02 {
    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 7;
        int b3 = b1 + b2;
        System.out.println(b3);
        int max = 2147483647;
        int n = max +23993;
        System.out.println(n);
        long l1 = 2147483647;
        long l2 = l1 +2147483647;
        long l3 = 23993 +2147483647;

        System.out.println(l3);
        long l4 = 23993 +2147483647l;
        System.out.println(l4);
        int n3 = 0;
        int m = 123;
        System.out.println(m/n3);
    }
}
