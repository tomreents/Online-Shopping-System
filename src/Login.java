import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    Login(){
            Scanner inp = new Scanner(System.in);
            System.out.println("Login");
        while(true) {
            System.out.print("Enter your id: ");
            String id = inp.nextLine();
            System.out.print("Enter your password: ");
            String pw = inp.nextLine();
            inp.nextLine();
            if (isValid(id, pw) == 1) {
                System.out.println("Welcome to online shopping system");
                System.out.println("Enter your option corresponding to the menu.");
                System.out.println("1. Logout \n 2. Browse Catalog.");
                int option = inp.nextInt();
                switch (option){
                    case 1:
                        Logout lo = new Logout();
                        break;
                    case 2:
                        System.out.println("Browsing!");
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }

            } else {
                System.out.println("Username or password do not match please try again");
                continue;
            }
            break;
        }
    }

    int isValid(String id, String pw) {
        try (BufferedReader bf = new BufferedReader(new FileReader("info.csv"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");
                if (values[0].equals(id) && values[6].equals(pw)) {
                    return 1;
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
