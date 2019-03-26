import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestValidateMachine {
    private ValidateMachine validator;

    @Before
    public void setUp() {
        validator = new ValidateMachine();
    }

    @Test
    public void testPhoneNumberValidator() {
        assertTrue(validator.phoneNumberValidator("+380631021340"));
    }

    @Test
    public void testEmailAdressValidator() {
        assertTrue(validator.emailAddressValidator("12321@gmail.com"));
    }

    @Test
    public void testDateValidator() {
        assertTrue(validator.dateValidator("01.04.1998"));
    }

    @Test
    public void testIpAddressValidator() {
        assertTrue(validator.ipAddressValidator("192.168.0.1"));
    }
}
