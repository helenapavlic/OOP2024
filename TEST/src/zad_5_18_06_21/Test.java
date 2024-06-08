package zad_5_18_06_21;

public class Test {
    public static void main(String[] args) {
        //Kreirajte jedan tim s MAXPLAYERS = 3
        Team team = new Team("Team name");

        //Kreirajte četiri igrača
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");
        Player player4 = new Player("Player 4");

        //Dodajte prvog, drugog, pa opet drugog igrača u tim
        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player2);

        //Dodajte treećeg i četvrtog igrača u tim
        team.addPlayer(player3);
        team.addPlayer(player4);

        System.out.println();

        team.listAllTeamPlayers();

        //Spremite podatke o timu u bin datoteku teamData.bin
        String fileName = "TEST/src/zad_5_18_06_21//teamData.bin";
        team.saveTeamData2File(fileName);

        //Pročitajte podatke iz datoteke teamData.bin
        team.readTeamData4File(fileName);
    }
}
