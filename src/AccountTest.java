import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter an account name");
        String accName = input.nextLine();
        myAccount.setName(accName);
        System.out.println();
        System.out.printf("name of my account is:%s%n",myAccount.getName());
    }

}