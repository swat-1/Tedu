package day0726;

public class Demo07 {
    public static void main(String[] args) {
        //逢7过

        for (int i = 1; i <= 100; i++) {
            if ((i % 7 == 0) || (i / 10 == 7) || (i % 10 == 7)) {
                System.out.println("*");
            } else {
                System.out.println(i);
            }
        }
    }
}
