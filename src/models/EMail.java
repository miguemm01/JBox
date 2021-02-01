package models;

public class EMail{
    private User owner;
    private String eMailSubject;
    private String eMailBody;
    private int eMailID;


    public int geteMailID() {
        return eMailID;
    }

    public void seteMailID(int eMailID) {
        this.eMailID = eMailID;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String geteMailSubject() {
        return eMailSubject;
    }

    public void seteMailSubject(String eMailSubject) {
        this.eMailSubject = eMailSubject;
    }

    public String geteMailBody() {
        return eMailBody;
    }

    public void seteMailBody(String eMailBody) {
        this.eMailBody = eMailBody;
    }
}
