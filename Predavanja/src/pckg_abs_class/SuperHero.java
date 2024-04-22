package pckg_abs_class;

public class SuperHero extends Person implements FlyAbility, Strenght {
    private String superHeroName;

    protected SuperHero(String name, String surname, String superHeroName) {
        super(name, surname);
        this.superHeroName = superHeroName;
    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + " super hero name: " + this.superHeroName);

    }

    @Override
    public void flyAroundTown() {
        System.out.println(this.superHeroName + " can fly...");
    }


    @Override
    public void haveEnourmousStrenght(int level) {
        System.out.println(this.superHeroName + " is " + level + " times stronger than regular human...");
    }
}
