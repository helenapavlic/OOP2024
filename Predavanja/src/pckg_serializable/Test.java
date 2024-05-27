package pckg_serializable;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String filePath = "Predavanja/src/pckg_serializable/test.bin";
        String filePath2 = "Predavanja/src/pckg_serializable/test1.bin";
        SpaceShip spaceShip = new SpaceShip("robi");
        SpaceShip spaceShip1 = new SpaceShip("enterprise");
        AUX_CLS.addObjectToFile(filePath, spaceShip);
        AUX_CLS.addObjectToFile(filePath, spaceShip1);

        List<SpaceShip> spaceShips = new ArrayList<>();
        spaceShips.add(spaceShip1);
        spaceShips.add(spaceShip);

        AUX_CLS.saveMultipleObjectsToFile(filePath2, spaceShips);

        SpaceShip spaceShipTest = AUX_CLS.readObjectFromFile(filePath);
        System.out.println(spaceShipTest);

//         nakon oporavka objekta iz bin datoteke stvori se novi objekt
        System.out.println("Recovered: " + Integer.toHexString(spaceShipTest.hashCode()));
        System.out.println("Original:  " + Integer.toHexString(spaceShip.hashCode()));
        System.out.println(spaceShipTest.equals(spaceShip));

//        provjera sa idem i imenom kroz sucelje koje smo sami realzirali
        System.out.println(spaceShip1.equalSpaceShips(spaceShip1, spaceShipTest));

        List<SpaceShip> spaceShipList = AUX_CLS.readObjectsFromFile(filePath2);
        System.out.println(spaceShipList);

    }
}
