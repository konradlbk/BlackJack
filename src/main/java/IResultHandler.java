public interface IResultHandler {

    void playerWon(int counter, int croupierCounter);
    void playerLost(int counter, int croupierCounter);
    void nobodyWins(int counter, int croupierCounter);
}
