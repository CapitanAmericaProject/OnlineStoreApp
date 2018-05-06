package onlineStore.Users;

public interface CanChangePassword {

    boolean validatePassword(User u, String password);

    void changePassword(User u, String password);
}
