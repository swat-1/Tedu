package day0727;

import java.util.Random;

public class Demo06 {
    public static void main(String[] args) {
        //存储一副扑克牌
        String [] cards = new String[54];
        for (int i = 0; i < cards.length; i++) {
            cards [i] = String.valueOf(i+1);
        }

        //定义随机数
        Random r = new Random();
        for (int i = 0; i < cards.length; i++) {
            int rIndex = r.nextInt(cards.length);
            System.out.println(cards[rIndex]);
        }

    }
}
