package function;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MakeNumber {
    public List<Integer> makeNumber() {
        Set<Integer> number = new HashSet<>();
        while (true) {
            int randNum = (int) (Math.random()*10);
            number.add(randNum);
            if (number.size() == 3) {
                break;
            }
        }
        List<Integer> setToList = new ArrayList<>(number);
        return setToList;
    }
}
