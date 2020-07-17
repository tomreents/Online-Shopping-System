import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class CreateAcc {
    String FirstName, LastName, id, password,address, phonenumber, creditcardNumber;
    CreateAcc(){
        Scanner inp = new Scanner(System.in);
        System.out.println("***Create Account***");
        System.out.print("Enter your First Name: ");
        this.FirstName = inp.nextLine();
        System.out.print("Enter your Last Name: ");
        this.LastName = inp.nextLine();
        System.out.print("Enter your address: ");
        this.address = inp.nextLine();
        System.out.print("Enter your phone number: ");
        this.phonenumber = inp.nextLine();
        System.out.print("Enter your credit card number: ");
        this.creditcardNumber = inp.nextLine();
        while(true){
            System.out.print("Enter your id: ");
            String id = inp.nextLine();
            if(isValidID(id) != 1){
                this.id = id;
            }
            else{
                System.out.println("User ID already taken please try again.");
                continue;
            }
            System.out.print("Enter your password: ");
            String pw1 = inp.nextLine();
            System.out.print("Verify your password: ");
            String pw2 = inp.nextLine();
            if(pw1.equals(pw2)){
                this.password = pw1;
            }
            else{
                System.out.println("Passwords do not match please try again.");
                continue;
            }

            break;
        }

    }

    int isValidID(String i) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if(values[0].equals(i)){
                    return 1;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
