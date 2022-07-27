package day0727;

import java.util.Random;

public class Demo07 {
    public static void main(String[] args) {
        String[] rank = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] cards = new String[54];

        cards[cards.length - 1] = "♀";
        cards[cards.length - 2] = "♂";
        Random random = new Random();
        for (int i = 0; i < rank.length; i++) {
            cards[i] = "♠" + rank[i];
            cards[i + 13] = "♥" + rank[i];
            cards[i + 13 + 13] = "♣" + rank[i];
            cards[i + 13 + 13 + 13] = "♦" + rank[i];
        }




        for (int i = 0; i < cards.length; i++) {
            int n = random.nextInt(cards.length);//0-53
            String temp = cards[i];
            cards[i] = cards[n];
            cards[n] = temp;
        }
        for (int i = cards.length - 1; i > 0; i--) {
            int n = random.nextInt(i);//53 --
            String temp = cards[i];
            cards[i] = cards[n];
            cards[n] = temp;
        }






        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i]);
        }
        System.out.println();
        String[] zhao = new String[17];
        String[] qian = new String[17];
        String[] sun = new String[17];

        for (int i = 0; i < 17; i++) {
            zhao[i] = cards[i * 3];
            qian[i] = cards[i * 3 + 1];
            sun[i] = cards[i * 3 + 2];

        }

        for (int i = 0; i < sun.length; i++) {
            System.out.print(sun[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < qian.length; i++) {
            System.out.print(qian[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < zhao.length; i++) {
            System.out.print(zhao[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(cards[53 - i] + " ");
        }
    }

}
