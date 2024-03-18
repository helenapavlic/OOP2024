package pckg_arrays;

public class MainApp {
    private static int value;
    private static String name;
    private static String[] names;

    public static void main(String[] args) {
//        alociranje memorije za 10 elemenata za tip int
//        inicijaliziran sa defaultnim vrijednostima
        int[] ints = new int[10];

//        inicijaliziran array sa elementima
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println("first arr: " + ints.length);
        System.out.println("first arr: " + array.length);

        System.out.println("third element in fst arr: " + ints[3]);
        System.out.println("third element in snd arr: " + array[3]);


        for(int k = 0; k < ints.length; k++){
            ints[k] = k+1;
        }

        System.out.println("third element in fst arr: " + ints[3]);

//        promjena promjene imena
        names = new String[10];
        changeElement(names,4);
    }

    private static void changeElement(String[] names, int indx){
//        String[] je složeni tip podataka -> pass by reference
//        nije potrebno imati return jer mijenjaju isti objekt
        if (indx <= names.length-1){
            String newName = "Neko novo ime";
            names[indx] = newName;
            System.out.println("Uspješna promjena imena");
        } else {
            System.out.println("index van liste");
        }
    }
}
