package day0725;

public class Demo01 {
    public static void main(String[] args) {
        byte b = 123;
        short ss = b;
        System.out.println(ss);
        short s1 = 300;
        byte b1 = (byte) s1;
        System.out.println(b1);
        s1 = 3000;
        b1 = (byte) s1;
        System.out.println(b1);

    }
}
