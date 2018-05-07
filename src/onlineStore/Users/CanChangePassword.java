package onlineStore.Users;

public interface CanChangePassword {

    boolean validatePassword(Customer u, String password);

    void changePassword(Customer u, String oldPassword, String newPassword);
}
