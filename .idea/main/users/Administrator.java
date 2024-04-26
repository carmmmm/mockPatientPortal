package main.users;

public class Administrator {
    public String firstName;
    public String administratorID;
    public String lastName;
    public String userName;
    private String password;


    public Administrator(String firstName, String administratorID, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.administratorID = administratorID;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getadministratorID() {
        return administratorID;
    }

    public void setAdministratorID(String patientID) {
        this.administratorID = patientID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
