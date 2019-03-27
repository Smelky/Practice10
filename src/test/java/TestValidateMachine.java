import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TestValidateMachine {
    private ValidateMachine validator;

    @Before
    public void setUp() {
        validator = new ValidateMachine();
    }

    @Test
    public void shouldTestValidPhoneNumber() {
        assertTrue(validator.phoneNumberValidator("+380631021340"));
    }

    @Test
    public void shouldTestInvalidPhoneNumber() {
        assertFalse(validator.phoneNumberValidator("+3806"));
    }

    @Test
    public void shouldTestValidEmailAddress() {
        assertTrue(validator.emailAddressValidator("12321@gmail.com"));
    }

    @Test
    public void shouldTestInvalidEmailAddress() {
        assertFalse(validator.emailAddressValidator("12321@com"));
    }

    @Test
    public void shouldTestValidDate() {
        assertTrue(validator.dateValidator("01.04.1998"));
    }

    @Test
    public void shouldTestInvalidDate() {
        assertFalse(validator.dateValidator("0104.198"));
    }

    @Test
    public void shouldTestValidIpAddress() {
        assertTrue(validator.ipAddressValidator("192.168.0.1"));
    }

    @Test
    public void shouldTestInvalidIpAddress() {
        assertFalse(validator.ipAddressValidator("192.168.1"));
    }
}
