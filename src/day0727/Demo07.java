package day0727;

public class Demo07 {
    public static void main(String[] args) {
        String [] rank = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        String [] cards = new String[54];
        cards [cards.length-1] = "♀";
        cards [cards.length-2] = "♂";

        for (int i = 0; i < rank.length; i++) {
            cards[i] ="♠"+rank[i];
            cards[i+13] ="♥"+rank[i];
            cards[i+13+13] ="♣"+rank[i];
            cards[i+13+13+13] ="♦"+rank[i];
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + " ");
        }

    }
 }
