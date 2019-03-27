import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMachine {

    private static final String PHONE_NUMBER_REGULAR_EXPRESSION = "^(\\+\\d{2})?\\d{10}$";
    private static final String EMAIL_ADDRESS_REGULAR_EXPRESSION = ".+(@).+\\.(com|net)";
    private static final String DATE_REGULAR_EXPRESSION = "^\\d{2}\\.\\d{2}\\.(\\d{4}|\\d{2})$";
    private static final String IP_ADDRESS_REGULAR_EXPRESSION = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";

    public Boolean phoneNumberValidator(String number) {
        Pattern numberValidator = Pattern.compile(PHONE_NUMBER_REGULAR_EXPRESSION);
        Matcher findMatches = numberValidator.matcher(number);
        return findMatches.matches();
    }

    public Boolean emailAddressValidator(String emailAdress) {
        Pattern emailValidator = Pattern.compile(EMAIL_ADDRESS_REGULAR_EXPRESSION);
        Matcher findMatches = emailValidator.matcher(emailAdress);
        return findMatches.matches();
    }

    public Boolean dateValidator(String date) {
        Pattern dateValid = Pattern.compile(DATE_REGULAR_EXPRESSION);
        Matcher findMatches = dateValid.matcher(date);
        return findMatches.matches();
    }

    public Boolean ipAddressValidator(String ipAddress) {
        Pattern ipValidator = Pattern.compile(IP_ADDRESS_REGULAR_EXPRESSION);
        Matcher findMatches = ipValidator.matcher(ipAddress);
        return findMatches.matches();
    }
}
