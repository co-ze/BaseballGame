import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int strike = 0, ball = 0;
        int tryNum;

        MakeNumber make = new MakeNumber();
        int[] winNumber = make.makeNumber();
        System.out.println("컴퓨터가 숫자를 생성했습니다!");
        while (true) {
            System.out.print(cnt+"번째 시도 : ");

            tryNum = sc.nextInt();
            if (tryNum > 999) {
                System.out.println("숫자 3개 입력!");
                continue;
            }else if (tryNum < 100) {
                System.out.println("숫자 3개 입력!");
                continue;
            }
            int[] userNum = {tryNum/100, tryNum/10%10, tryNum%10};

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
        System.out.println(cnt+"번만에 맞추셨습니다.");
        System.out.println("게임 종료!");
    }
}