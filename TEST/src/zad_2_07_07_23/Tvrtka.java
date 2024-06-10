package zad_2_07_07_23;

public class Tvrtka {
    private String companyName;
    private String companyAddress;
    private String city;
    private String mail;

    public Tvrtka(String companyName, String companyAddress, String city, String mail) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.city = city;
        this.mail = mail;
    }

    public static int getNumberOfFields(Class<?> clazz){
        return clazz.getDeclaredFields().length;
    }

    @Override
    public String toString() {
        return "Tvrtka{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", city='" + city + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
