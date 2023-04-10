import java.util.Scanner;

public class InputNum {
    int[] inputNumber = new int[3];
    int num = 0;

    public int[] inputNumber() throws InputException{
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num > 999 || num < 100) {
            throw new InputException();
        }
        int[] inputNumber = {num / 100, num / 10 % 10, num % 10};
        return inputNumber;
    }
}
