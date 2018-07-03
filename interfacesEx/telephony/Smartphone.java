import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Dialable, WebBrowseable {

    private static final String REGEX_NUM = "\\b\\d+\\b";
    private static final String DEFAULT_ERROR_NUMBER = "Invalid number!";
    private static final String REGEX_URL = "\\d+";
    private static final String DEFAULT_ERROR_URL = "Invalid URL!";


    @Override
    public void call(String phoneNumber) {
        if (!phoneNumber.matches(REGEX_NUM)) {
            throw new IllegalArgumentException(DEFAULT_ERROR_NUMBER);
        }
    }

    @Override
    public void browse(String url) {

        Pattern pattern = Pattern.compile(REGEX_URL);
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            throw new IllegalArgumentException(DEFAULT_ERROR_URL);
        }
    }


}
