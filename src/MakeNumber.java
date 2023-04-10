public class MakeNumber {
    int[] number = new int[3];

    public int[] makeNumber() {
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (number[i] == number[j]) {
                    i--;
                    break;
                }
            }
        }
        return number;
    }
}
