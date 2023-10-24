package user;

public class User {
    private String userBaseballNumber = "";

    public User(String userBaseballNumber) {
        this.userBaseballNumber = userBaseballNumber;
    }

    public String getUserBaseballNumber() {
        return userBaseballNumber;
    }

    public void setUserBaseballNumber(String userBaseballNumber) {
        this.userBaseballNumber = userBaseballNumber;
    }
}
