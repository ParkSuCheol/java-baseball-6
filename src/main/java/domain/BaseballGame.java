package domain;

public class BaseballGame {
    private int ball;
    private int strike;

    public int getStrike() {
        return strike;
    }

    public int[] getNumberCompareResult(String userNumbers, String answerNumbers) {
        resetCount();
        ballCount(userNumbers, answerNumbers);
        strikeCount(userNumbers, answerNumbers);
        strikeExceptBall();

        return new int[]{ball, strike};
    }

    private void strikeExceptBall() {
        ball = ball - strike;
    }

    private void strikeCount(String userNumbers, String answerNumbers) {
        for (char userNumber : userNumbers.toCharArray()) {
            if (answerNumbers.indexOf(userNumber) == userNumbers.indexOf(userNumber)) {
                strike++;
            }
        }
    }

    private void ballCount(String userNumbers, String answerNumbers) {
        for (int i = 0; i < 3; i++) {
            if (answerNumbers.contains(Character.toString(userNumbers.charAt(i)))) {
                ball++;
            }
        }
    }

    public void resetCount() {
        ball = 0;
        strike = 0;
    }


}
