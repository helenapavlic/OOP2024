package zad_5_18_06_21;

import java.io.*;
import java.util.LinkedHashSet;

public class Team {
    private static final int MAXPLAYERS = 3;
    private String name;
    private LinkedHashSet<Player> players;

    public Team(String name) {
        this.name = name;
        players = new LinkedHashSet<>();
    }

    public void addPlayer(Player player) {
        long numPlayers = players.size();
        if (numPlayers == MAXPLAYERS) {
            System.out.println("Unable to add a new player - max number of players is in the team... ");
        } else if (!players.contains(player)) {
            players.add(player);
            System.out.println(player.getName() + " added to the team - " + name);
        } else {
            System.out.println(player.getName() + " is already in this team.");
        }
    }

    public void listAllTeamPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
        System.out.println();
    }

    public void saveTeamData2File(String filePath) {
        try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Player player : players) {
                oos.writeObject(player);
            }
        } catch (IOException e) {
            System.out.println("error in saving to bin file");
        }

        System.out.println("The team data written in the file: " + filePath);
        System.out.println();
    }

    public void readTeamData4File(String filePath) {
        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("Success - reading from file was ok!");
            System.out.println("All data from the file - " + filePath);
            for (Player player : players) {
                System.out.println(ois.readObject());
            }
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("error in reading from bin file");
        }
        System.out.println();
    }


}
