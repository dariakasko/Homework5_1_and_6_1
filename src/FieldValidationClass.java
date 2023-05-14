import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FieldValidationClass {
    public static String isStringWithLetters(String inputValue) {

        while (!inputValue.matches("^[a-zA-Z]*$")) {
            System.out.print("There should be only letters (no numbers, no symbols). Try again: ");
            inputValue = new Scanner(System.in).next();
        }
        return inputValue;
    }
}
