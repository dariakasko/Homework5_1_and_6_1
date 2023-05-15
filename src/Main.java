import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        AdditionalUserClass.createUsers();
        System.out.println("\nAll users spent " + User.amountSpentMoney + "$");
        System.out.println("Total discount is: " + User.discount + "%");
        System.out.print("Total amount of spent money with discount: " + User.addDiscount(User.discount));

    }
}