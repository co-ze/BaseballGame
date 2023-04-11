package function;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Checker {
    private static final String NUMBER_REG = "^[0-9]*$";
    public List<Integer> checkIsValid(String num) throws Exception{
        List<Integer> inputNumber = new ArrayList<>();
        if (!Pattern.matches(NUMBER_REG, num)) {
            throw new InputValException("문자");
        }
        if (num.length() != 3) {
            throw new InputLenException();
        }
        for (int i = 0; i < num.length(); i++) {
            inputNumber.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        return inputNumber;
    }
}
