package Models.Login;

public class UserModel {

    private String userName;
    private int roleId;
    private String pass;

    public UserModel(String userName, int roleId, String pass) {
        this.userName = userName;
        this.roleId = roleId;
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
