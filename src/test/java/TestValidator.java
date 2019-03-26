import org.junit.Test;

public class TestValidator {

    @Test
    public void testPhoneNumberValidator() {
        Validator validator = new Validator();
        validator.phoneNumberValidator("+380631021340");
    }

    @Test
    public void testEmailAdressValidator() {
        Validator validator = new Validator();
        validator.emailAddressValidator("12321@gmail.com");
    }

    @Test
    public void testDateValidator() {
        Validator validator = new Validator();
        validator.dateValidator("01.04.1998");
    }

    @Test
    public void testIpAddressValidator() {
        Validator validator = new Validator();
        validator.ipAddressValidator("192.168.0.1");
    }
}
