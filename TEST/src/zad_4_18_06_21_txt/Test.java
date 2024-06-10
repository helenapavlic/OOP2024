package zad_4_18_06_21_txt;

public class Test {
    public static void main(String[] args) {
        WorldCup worldCup1 = new WorldCup();
        worldCup1.worldCupInYear(5);

        //Spremite te podatke u datoteku worldCup.txt
        String fileName = "TEST/src/zad_4_18_06_21_txt/worldCup.txt";
        worldCup1.save2File(fileName);

        // Kreirajte i ispišite listu sudionika (4) za npr. 1990. godinu
        WorldCup worldCup2 = new WorldCup();
        worldCup2.worldCupInYear(4);

        //Spremite te podatke u datoteku worldCup.txt
        worldCup2.save2File(fileName);

        //Kreirajte i ispišite listu sudionika (3) za 2010. godinu
        WorldCup worldCup3 = new WorldCup();
        worldCup3.worldCupInYear(3);

        //Spremite te podatke u datoteku worldCup.txt
        worldCup3.save2File(fileName);

        //Pročitajte i prikažite u konzoli podatke iz datoteke worldCup.txt
        worldCup3.read4File(fileName);

    }

}
