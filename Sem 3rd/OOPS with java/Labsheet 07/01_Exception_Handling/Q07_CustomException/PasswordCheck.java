class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) { super(message); }
}
public class PasswordCheck {
    static void validate(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must contain at least 6 characters.");
        }
        System.out.println("Password accepted.");
    }
    public static void main(String[] args) {
        try {
            validate("abc");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
