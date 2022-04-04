
import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    public static String expected;
    public static String actual;


    UserRegistration test = new UserRegistration();

    @Test
    public void givenFirstNameWithOneUpperCaseAtStart() {
        boolean firstName = test.validateFirstName("Akhanda");
        Assert.assertEquals(true, firstName);
    }

    @Test
    public void givenLastNameWithOneUpperCaseAtStart() {
        boolean lastName = test.validateLastName("Khan");
        Assert.assertEquals(true, lastName);
    }

    @Test
    public void givenValidEmailHas3MandatoryPartsAnd2Optional() {
        boolean email = test.validateEmail("abc@gmail.com.com");
        Assert.assertEquals(true, email);
    }

    @Test
    public void givenMobileFormatCountryCodeFollowedBySpaceAnd10DigitNumber() {
        boolean mobNum = test.validateMobNumber("91 8919172664");
        Assert.assertEquals(true, mobNum);
    }

    @Test
    public void givenPasswordMinimum1NumericUpperCaseLowerCaseAndExact1SpecialCharacterValueAndMinimum8Characters() {
        boolean password = test.validatePassword("Iqbal24@Khan97");
        Assert.assertEquals(true, password);
    }
}