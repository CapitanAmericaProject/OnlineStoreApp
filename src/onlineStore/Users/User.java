package onlineStore.Users;

public abstract class User{

    private String username;
    private String password;

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    public abstract void login(User u, Store store);
}
