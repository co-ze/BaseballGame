import function.Checker;
import function.Compare;
import function.InputNumber;
import function.MakeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameLauncher {
    MakeNumber makeNumber = new MakeNumber();
    Checker checker = new Checker();
    Compare compare = new Compare();
    List<Integer> winNum = new ArrayList<>();
    List<Integer> tryNum = new ArrayList<>();
    int cnt = 1;
    public void beginning() {
        winNum = makeNumber.makeNumber();
        System.out.println("!!숫자 야구 시작!!");
        System.out.print("답 : ");
        for (Integer integer : winNum) {
            System.out.print(integer);
        }
        System.out.println();
    }
    public boolean play() throws Exception{
        while (true) {
            System.out.print(cnt+"번째 시도 : ");

            String input = InputNumber.inputNumber(); //숫자(문자열) 입력 받아 input에 할당.

            tryNum = checker.checkIsValid(input); //입력 받은 숫자(문자열)의 유효성을 확인하고 tryNum(list)에 할당. (checker 내부에서 Integer로 변환)

            String result = compare.compare(winNum, tryNum); //생성한 랜덤 숫자와 입력 받은 숫자 비교 후 결과 반환.
            System.out.println(result);
            if (Objects.equals(result, "3S")) {
                System.out.println(cnt+"번 만에 맞췄습니다.");
                System.out.println("게임 종료!");
                return true;
            }
            cnt++;
        }
    }

}
