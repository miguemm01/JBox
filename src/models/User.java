package models;

public class User{
    private String userName;
    private String userPassword;
    private int userID;

    public User(String userName, String userPassword, int userID){
        this.setUserName(userName);
        this.setUserPassword(userPassword);
        this.setUserID(userID);
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }
}
