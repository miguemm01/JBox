package controllers;

import models.EMail;
import models.User;

import java.util.ArrayList;

public class EMailController{
    private ArrayList<EMail> eMailList = new ArrayList<EMail>();
    private ArrayList<User> ownerList = new ArrayList<User>();

    public boolean sendEmailByUserID(int senderID, int receptorID){ //UNCOMPLETED
        UserController userCtrl = new UserController();
        boolean success = false;
        int counter;
        for(counter = 0; counter < this.geteMailList().size(); counter++){
            userCtrl.getUserByID(senderID);
            success = true;
        }
        return success;
    }


    public boolean deleteEMailBySubject(String eMailSubject){
        boolean success = false;
        int counter;
        for(counter = 0; counter < this.geteMailList().size(); counter++){
            if(this.geteMailList().get(counter).geteMailSubject().equals(eMailSubject)){
                this.geteMailList().remove(counter);
                this.getOwnerList().remove(counter);
                success = true;
            }
        }
        return success;
    }

    public boolean deleteEMailByID(int eMailID){
        boolean success = false;
        int counter;
        for(counter = 0; counter < this.geteMailList().size(); counter++){
            if(this.geteMailList().get(counter).geteMailID() == eMailID){
                this.geteMailList().remove(counter);
                this.getOwnerList().remove(counter);
                success = true;
            }
        }
        return success;
    }


    public boolean addEMail(User owner, EMail eMail){
        boolean success = false;
        if(this.geteMailList().add(eMail) && this.getOwnerList().add(owner)){
            success = true;
        }
        return success;
    }


    public ArrayList<User> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(ArrayList<User> ownerList) {
        this.ownerList = ownerList;
    }

    public ArrayList<EMail> geteMailList() {
        return eMailList;
    }

    public void seteMailList(ArrayList<EMail> eMailList) {
        this.eMailList = eMailList;
    }
}
