package zad_3_23_06_23_guessGame_txt;

public class App {
    public static void main(String[] args) {
        Player player = new Player("player 1");
        Game game  = new Game();
        game.startGame(player);
        game.startGame(player);

        Player player1 = new Player("test player");
        game.startGame(player1);
    }
}
