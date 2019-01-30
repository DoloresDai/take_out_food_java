public class InputNullException extends RuntimeException {
    InputNullException(String message) {
        super(message);
    }
}

class InputWrongException extends RuntimeException {
    InputWrongException(String message) {
        super(message);
    }
}