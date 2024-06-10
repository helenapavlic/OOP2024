package zad_3_23_06_23_guessGame_txt;

public class Player {
    private static int cntID = 1;
    private int id;
    private String name;
    private int guessed;
    private int missed;
    private int gamesPlayed;
    private String playerToFind;

    public Player(String name) {
        this.id = cntID++;
        this.guessed = 0;
        this.missed = 0;
        gamesPlayed = 0;
        this.name = name;
        this.playerToFind = "Player{" +
                "id=" + id +
                ", name='" + name + '\'';
    }

    public String getPlayerToFind() {
        return playerToFind;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public int getGuessed() {
        return guessed;
    }

    public void setGuessed(int guessed) {
        this.guessed = guessed;
    }

    public int getMissed() {
        return missed;
    }

    public void setMissed(int missed) {
        this.missed = missed;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guessed=" + guessed +
                ", missed=" + missed +
                ", gamesPlayed=" + gamesPlayed +
                '}';
    }
}
