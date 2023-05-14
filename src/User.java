import java.util.Scanner;

public class User {
    public String userName, email;
    private int age;
    private String password;
    public boolean isActive;
    public static double amountSpentMoney;
    public String gitVar;

    public User() { //empty class constructor
    }
    public User(String userName) { //class constructor2
        this.userName = userName;
    }
    public User(String userName, String password) { //class constructor3
        this.userName = userName;
        setPassword(password); //password will be verified via setter for pwd field
    }
    public int getAge() { //getter for private field "age"
        return this.age;
    }
    public void setAge(int age) { //setter for private field "age"
        if (age < 18 || age > 100) // age verification
        {
            System.out.println("Age is incorrect, try again");
            Scanner inputValue = new Scanner(System.in);
            setAge(inputValue.nextInt());

        } else {
            this.age = age;
        }
    }

    public String getPassword() { //getter for private field "password"
        return this.password;

    }
    public void setPassword(String password) { //setter for private field "password"
        String regExpPassword = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{6,10}"; // using regular expression for pwd validation
        if (password.matches(regExpPassword)) {
            this.password = password;
        }
        else {
            System.out.println("Password is incorrect, it should contain at least 1 capital letter, 1 usual letter, 1 symbol and 1 number");
            System.out.print("Try again: ");
            Scanner inputPwd = new Scanner(System.in);
            setPassword(inputPwd.next());
        }

    }

    public void makePurchase(double purchasePrice) {
        System.out.println("A purchase was made in the amount of " + purchasePrice + "$");
        amountSpentMoney = amountSpentMoney + purchasePrice;
    }
    public void printTotalAmountOfSpentMoney() {
        System.out.println(amountSpentMoney);
    }
    public void showUserData() {
        System.out.println("User name: " + userName );
        System.out.println("Age: " + age );
        System.out.println("Email: " + email );
        System.out.println("Password: " + password );
        System.out.println("");
    }
}
