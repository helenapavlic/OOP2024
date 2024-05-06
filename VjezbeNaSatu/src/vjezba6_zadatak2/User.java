package vjezba6_zadatak2;

public class User {

    private int userId;
    private String userName;
    private String password;

    public User(String userName, String password, int id){
        this.password = password;
        this.userId = id;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
