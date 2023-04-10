public class GameLauncher {
    int cnt;
    int strike, ball;
    public void gameLauncher() throws InputException {
        while (true) {
            System.out.print(cnt+"번째 시도 : ");

            InputNum inputNum = new InputNum();

            try {
                int[] userNum = inputNum.inputNumber();
            } catch (InputException e) {
                System.out.println(e.getMessage());
                continue;
            }
            for (int i = 0; i < number.length; i++) {
                for (int j = 0; j < userNum.length; j++) {
                    if (number[i] == userNum[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            if (ball == 3) {
                System.out.println("3B");
            }else if (strike == 3){
                System.out.println("3S");
                break;
            }else {
                System.out.println(ball+"B"+strike+"S");
            }
            cnt++;
            strike = 0;
            ball = 0;
        }
    }

}
