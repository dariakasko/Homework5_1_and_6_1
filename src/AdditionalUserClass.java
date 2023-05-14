import java.util.Scanner;

public class AdditionalUserClass {

    public static void createUsers() {
        System.out.print("How much users do you want to create: ");

        Scanner userQuantity = new Scanner(System.in);

        User[] arrayOfUsers = new User[userQuantity.nextInt()];

        for (int i = 0; i < arrayOfUsers.length; i++) {
            arrayOfUsers[i] = new User();

            System.out.print("User name: ");
            String userNameInput = new Scanner(System.in).next();

            arrayOfUsers[i].userName = FieldValidationClass.isStringWithLetters(userNameInput);

            System.out.print("Age: ");
            Scanner userAge = new Scanner(System.in);

            arrayOfUsers[i].setAge(userAge.nextInt());

            System.out.print("Email: ");
            Scanner userEmail = new Scanner(System.in);

            arrayOfUsers[i].email = userEmail.next();

            System.out.print("Password: ");
            Scanner userPassword = new Scanner(System.in);
            arrayOfUsers[i].setPassword(userPassword.next());

            System.out.print("Enter purchase price: ");
            Scanner userPurchase = new Scanner(System.in);
            arrayOfUsers[i].makePurchase(userPurchase.nextDouble());

            arrayOfUsers[i].isActive = true;

            System.out.println("User " + (i + 1) + " is created" + "\n");

        }

        for (User arrayElement : arrayOfUsers) {
            arrayElement.showUserData();
        }
    }
}
