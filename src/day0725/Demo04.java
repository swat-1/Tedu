package day0725;

public class Demo04 {
    public static void main(String[] args) {
        byte b = Byte.MAX_VALUE;
        System.out.println(b);
        short s = Short.MAX_VALUE;
        System.out.println(s);
        int n = Integer.MAX_VALUE;
        System.out.println(n);
        long l = Long.MAX_VALUE;
        System.out.println(l);
        float f = Float.MAX_VALUE;
        System.out.println(f);
        double d = Double.MAX_VALUE;
        System.out.println(d);
        //可观测宇宙的大小:940亿光年
        //光速300000公里/秒
        double c = 300000;
        double x = c * 60 * 60 * 24 * 365 * 940 * 100000000L;
        System.out.println(x);
    }
}
