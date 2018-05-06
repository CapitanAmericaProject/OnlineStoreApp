package onlineStore.Users;

public abstract class User implements CanChangePassword{

    private String username;
    private String password;
    Store store;

    public User(String username, String password) {

        this.username = username;
        this.password = password;
        store = new Store();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void login(User user);
}
