package main.users;

public class Patient {
    public String firstName;
    public String patientID;
    public String lastName;
    public String userName;
    private String password;

    public Patient(String firstName, String patientID, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.patientID = patientID;
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

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
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

