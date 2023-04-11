package exception;

public class InputValException extends Exception{
    public InputValException(String type) {
        super(type+"가 아닌 숫자만 입력해주세요.");
    }
}
