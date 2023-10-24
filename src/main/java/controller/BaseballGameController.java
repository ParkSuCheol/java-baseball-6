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
            setUserNumber();
        } while (!isGameEnd());
    }

    public void setUserNumber() {
        user.setUserBaseballNumber(InputView.setUserNumber());
    }

    public boolean isGameEnd() {
        return true;
    }

}
