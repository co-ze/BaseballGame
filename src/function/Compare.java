package function;

import java.util.List;

public class Compare {
    public String compare(List<Integer> winNum, List<Integer> tryNum) {
        int strike = 0, ball = 0;
        String result;
        for (int i = 0; i < tryNum.size(); i++) {
            if (tryNum.get(i) == winNum.get(i)) {
                strike++;
            }
            else if (winNum.contains(tryNum.get(i))) {
                ball++;
            }
        }
        //첫 제어문에서 인덱스와 값이 같을 경우를 걸러준다.
        //그럼 볼 / 볼이 아님 두 가지 경우만 남는다.
        //list의 contains를 이용해 쉽게 확인할 수 있다. (list를 사용한 이유)

        result = makeResult(strike, ball);
        return result;
    }
    public String makeResult(int strike, int ball) {
        if (strike == 3) return "3S";
        else if (ball == 3) return "3B";
        else return strike+"S"+ball+"B";
    }
}
