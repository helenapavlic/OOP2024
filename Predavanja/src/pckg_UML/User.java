package pckg_UML;

public class User {
    private int id;
    private String userName;
    private String mail;
    private String password;
    private static int cntId = 100;


    public User(String userName, String password, String mail) {
        this.id = cntId++;
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }

    public boolean activateAccount(){
        return true;
    }

    public boolean login(String passwd, String userName){
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
