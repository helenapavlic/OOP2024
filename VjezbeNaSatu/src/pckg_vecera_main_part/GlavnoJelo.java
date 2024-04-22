package pckg_vecera_main_part;

import java.util.concurrent.ThreadLocalRandom;

public class GlavnoJelo {
    float cijena;

    public GlavnoJelo() {
        System.out.println("spremljeno i servirano");
    }

    float totalPrice() {
        return ThreadLocalRandom.current().nextFloat(50.5f, 250.8f);
    }

}
