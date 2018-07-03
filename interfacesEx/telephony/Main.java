import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");
        callNumbers(numbers);

        browseUrls(urls);


    }

    private static void browseUrls(String[] urls) {
        for (String url : urls) {
            WebBrowseable phoneUrl = new Smartphone();
            try {
                phoneUrl.browse(url);
                System.out.printf("Browsing: %s!%n", url);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void callNumbers(String[] numbers) {
        for (String num : numbers) {
            Dialable number = new Smartphone();
            try {
                number.call(num);
                System.out.printf("Calling... %s%n", num);
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
