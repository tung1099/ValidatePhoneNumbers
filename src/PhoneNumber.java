import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static final String PHONENUMBERS_REGEX = "^[84|0][1-9]+[0-9]{8,9}";

    public PhoneNumber() {
    }

    public boolean validate(String inputPhoneNumbers){
        Pattern pattern = Pattern.compile(PHONENUMBERS_REGEX);
        Matcher matcher = pattern.matcher(inputPhoneNumbers);
        return matcher.matches();
    }
}
