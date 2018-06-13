public class Results implements IResultHandler {
    BlackJack blackJack = new BlackJack();
    public void playerWon(int counter, int croupierCounter) {

        if (counter>croupierCounter){
            System.out.println("Gratulacje! Gracz numer jeden wygrał!");
            System.exit(0);
        }
        if (croupierCounter>21){
            System.out.println("Wygrał gracz numer jeden!");
            System.exit(0);
        }
    }

    public void playerLost(int counter, int croupierCounter) {
        if (counter<croupierCounter){
            System.out.println("Wygrał krupier");
            System.exit(0);
        }
        if (counter>21){
            System.out.println("Niestety, krupier wygrał.");
            System.exit(0);
        }
    }

    public void nobodyWins(int counter, int croupierCounter) {
        if (croupierCounter==counter){
            System.out.println("REMIS!");
            System.exit(0);
        }
    }
}
