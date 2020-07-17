
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        int a = 0;
        while (a == 0) {
            System.out.println("*****Online Shopping System*****");
            System.out.println("Select your option corresponding to the menu.");
            System.out.println("1. Create Account \n 2. Login \n 3. Exit.");
            Scanner in = new Scanner(System.in);
            int option = in.nextInt();
            switch (option) {
                case 1:
                    CreateAcc us1 = new CreateAcc();
                    System.out.println("Account created ");
                    FileWrite f = new FileWrite(us1);
                    break;
                case 2:
                    Login log = new Login();
                    break;
                case 3:
                    a = 1;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }

}