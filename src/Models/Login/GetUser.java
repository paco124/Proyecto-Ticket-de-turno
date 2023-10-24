package Models.Login;

public class GetUser {
    private String userName;
    private int roleId;

    public GetUser(String userName, int roleId) {
        this.userName = userName;
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    
}
