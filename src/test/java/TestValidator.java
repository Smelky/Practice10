import org.junit.Before;
import org.junit.Test;

public class TestValidator {
    private Validator validator;

    @Before
    public void setUp() {
        validator = new Validator();
    }

    @Test
    public void testPhoneNumberValidator() {
        validator.phoneNumberValidator("+380631021340");
    }

    @Test
    public void testEmailAdressValidator() {
        validator.emailAddressValidator("12321@gmail.com");
    }

    @Test
    public void testDateValidator() {
        validator.dateValidator("01.04.1998");
    }

    @Test
    public void testIpAddressValidator() {
        validator.ipAddressValidator("192.168.0.1");
    }
}
