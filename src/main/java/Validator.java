import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final Logger log = Logger.getLogger(Validator.class.getName());

    public void phoneNumberValidator(String number) {

        Pattern numberValidator = Pattern.compile("^(\\+\\d{2})?\\d{10}$");
        Matcher findMatches = numberValidator.matcher(number);
        if (findMatches.matches()) {
            log.info("Correct number");
        } else {
            log.info("Incorrect number");
        }
    }

    public void emailAddressValidator(String emailAdress) {
        Pattern emailValidator = Pattern.compile(".+(@).+\\.(com|net)");
        Matcher findMatches = emailValidator.matcher(emailAdress);
        if (findMatches.matches()) {
            log.info("Correct email");
        } else {
            log.info("Incorrect email");
        }
    }

    public void dateValidator(String date) {
        Pattern dateValid = Pattern.compile("^\\d{2}\\.\\d{2}\\.(\\d{4}|\\d{2})$");
        Matcher findMatches = dateValid.matcher(date);
        if (findMatches.matches()) {
            log.info("Correct date");
        } else {
            log.info("Incorrect date");
        }
    }

    public void ipAddressValidator(String ipAddress) {
        Pattern ipValidator = Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher findMatches = ipValidator.matcher(ipAddress);
        if (findMatches.matches()) {
            log.info("Correct ipAddress");
        } else {
            log.info("Incorrect ipAddress");
        }
    }
}
