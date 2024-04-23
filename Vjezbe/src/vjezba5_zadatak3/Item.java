package vjezba5_zadatak3;

abstract class Item {

    abstract float itemPrice();

    abstract float getPrice();

    abstract int getKom();

    public Item(){

    }


    protected class T_Shirt extends Item {

        float tshirtPrice;
        int komTshirt;

        T_Shirt(float price, int kom) {
            this.komTshirt = kom;
            this.tshirtPrice = price;
        }

        float getPrice() {
            return tshirtPrice;
        }

        int getKom() {
            return komTshirt;
        }

        @Override
        float itemPrice() {
            return komTshirt * tshirtPrice;
        }
    }

    protected class Pants extends Item {
        float pantPrice;
        int komPant;

        Pants(float price, int kom) {
            this.komPant = kom;
            this.pantPrice = price;
        }

        float getPrice() {
            return pantPrice;
        }

        int getKom() {
            return komPant;
        }

        @Override
        float itemPrice() {
            return komPant * pantPrice;
        }
    }

    protected class Helmet extends Item {

        float helmetPrice;
        int komHelmet;

        Helmet(float price, int kom) {
            this.helmetPrice = price;
            this.komHelmet = kom;
        }

        float getPrice() {
            return helmetPrice;
        }

        int getKom() {
            return komHelmet;
        }

        @Override
        float itemPrice() {
            return komHelmet * helmetPrice;
        }
    }

    protected class Sneakers extends Item {

        float sneakersPrice;
        int komSneakers;

        Sneakers(float price, int kom) {
            this.komSneakers = kom;
            this.sneakersPrice = price;
        }

        float getPrice() {
            return sneakersPrice;
        }

        int getKom() {
            return komSneakers;
        }

        @Override
        float itemPrice() {
            return komSneakers * sneakersPrice;
        }
    }
}