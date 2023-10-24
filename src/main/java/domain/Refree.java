package domain;

public class Refree {
    private final BaseballGame baseballGame;

    public Refree() {
        baseballGame = new BaseballGame();
    }

    public int[] getNumberCompare(String userNumbers, String answerNumbers) {
        return baseballGame.getNumberCompareResult(userNumbers, answerNumbers);
    }

    public boolean isGameSet() {
        if (baseballGame.getStrike() == 3) {
            return true;
        }
        return false;
    }
}
