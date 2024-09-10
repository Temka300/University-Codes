public class User {
    String userID;
    String firstName;
    String lastName;

    public User(String firstName, String lastName) {
        this.userID = IDManager.generateID();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "User ID: " + userID + " First Name: " + firstName + " Last Name: " + lastName;
    }
}