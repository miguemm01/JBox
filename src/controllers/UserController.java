package controllers;

import models.User;

import java.util.ArrayList;

public class UserController{
    private ArrayList<User> userList = new ArrayList<>();

    public User getUserByID(int userID){
        int counter;
        User user = new User("", "", 0);
        for(counter = 0; counter < this.getUserList().size(); counter++){
            if(this.getUserList().get(counter).getUserID() == userID){
                user = this.getUserList().get(counter);
            }
        }
        return user;
    }

    public boolean updateUserByID(int userID, String newUserName){
        boolean success = false;
        int counter;
        for(counter = 0; counter < this.getUserList().size(); counter++){
            if(this.getUserList().get(counter).getUserID() == userID){
                this.getUserList().get(counter).setUserName(newUserName);
                success = true;
            }
        }
        return success;
    }

    public boolean updateUserByUsername(String userName, String newUserName){
        boolean success = false;
        int counter;
        for(counter = 0; counter < this.getUserList().size(); counter++){
            if(this.getUserList().get(counter).getUserName().equals(userName)){
                this.getUserList().get(counter).setUserName(newUserName);
                success = true;
            }
        }
        return success;
    }


    public boolean removeUserByID(int userID){
        boolean success = false;
        int counter;
        for(counter = 0; counter < this.getUserList().size(); counter++){
            if(this.getUserList().get(counter).getUserID() == userID){
                this.getUserList().remove(counter);
                success = true;
            }
        }
        return success;
    }


    public boolean removeUserByUsername(String userName){
        boolean success = false;
        int counter;
        for(counter = 0; counter < this.getUserList().size(); counter++){
            if(this.getUserList().get(counter).getUserName().equals(userName)){
                this.getUserList().remove(counter);
                success = true;
            }
        }
        return success;
    }


    public boolean addUser(User user){
        boolean success = false;
        int counter, counter2 = 0;
        for(counter = 0; counter < this.getUserList().size(); counter++){
            if(this.getUserList().get(counter).getUserID() != user.getUserID()){
                counter2++;
            }
        }
        if(counter2 == (this.getUserList().size() - 1)){
            success = true;
            this.getUserList().add(user);
        }
        return success;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}
