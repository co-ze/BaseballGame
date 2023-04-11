package exception;

public class InputLenException extends Exception{
    public InputLenException() {
        super("숫자 3개를 입력해주세요!");
    }
}
