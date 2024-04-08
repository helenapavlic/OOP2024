package pckg_equals;

public class User {
    private String userName;
    private int id;
    private static int cntId = 10;

    public User(String userName){
        this.userName = userName;
        this.id = cntId++;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }

    public void showHashCodeAsHex(){
        System.out.println(this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()));
    }


    public String getUserName(){
        return userName;
    }


    @Override
    public boolean equals(Object oth) {
        //type casting -> treba izbjegavat
        User other = (User) oth;
        return this.getUserName().length() == other.getUserName().length();
    }
}
