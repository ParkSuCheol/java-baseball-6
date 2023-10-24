package controller;

import user.User;
import view.InputView;

public class BaseballGameController {
    private static User user;

    public BaseballGameController() {

    }

    public BaseballGameController(User user) {
        user = this.user;
    }

    public void startGame() {
        do {
            getUserNumber();
        } while (!isGameEnd());
    }

    public void setUserNumber() {
        user = new User(InputView.setUserNumber());
    }

    public void getUserNumber() {
        user.getUserBaseballNumber();
    }


    public boolean isGameEnd() {
        return true;
    }

}
