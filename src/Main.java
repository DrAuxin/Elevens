public class Main {

    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};

        String[] suits = {"blue", "red"};

        int[] pointValues = {11, 12, 13};

        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println(d.size());
    }
}
