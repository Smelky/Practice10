import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMachine {

    public Boolean phoneNumberValidator(String number) {
        Pattern numberValidator = Pattern.compile("^(\\+\\d{2})?\\d{10}$");
        Matcher findMatches = numberValidator.matcher(number);
        return findMatches.matches();
    }

    public Boolean emailAddressValidator(String emailAdress) {
        Pattern emailValidator = Pattern.compile(".+(@).+\\.(com|net)");
        Matcher findMatches = emailValidator.matcher(emailAdress);
        return findMatches.matches();
    }

    public Boolean dateValidator(String date) {
        Pattern dateValid = Pattern.compile("^\\d{2}\\.\\d{2}\\.(\\d{4}|\\d{2})$");
        Matcher findMatches = dateValid.matcher(date);
        return findMatches.matches();
    }

    public Boolean ipAddressValidator(String ipAddress) {
        Pattern ipValidator = Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher findMatches = ipValidator.matcher(ipAddress);
        return findMatches.matches();
    }
}
