import java.io.*;
//id,First_Name,Last_Name,Address,PhoneNumber,Credit_Card_Number,password
public class FileWrite {
    FileWrite(CreateAcc acc1){
        try(FileWriter wr = new FileWriter("info.csv", true)){
            wr.append("\n");
            wr.append(acc1.id);
            wr.append(",");
            wr.append(acc1.FirstName);
            wr.append(",");
            wr.append(acc1.LastName);
            wr.append(",");
            wr.append(acc1.address);
            wr.append(",");
            wr.append(acc1.phonenumber);
            wr.append(",");
            wr.append(acc1.creditcardNumber);
            wr.append(",");
            wr.append(acc1.password);
            wr.close();
            System.out.println("Account added to database.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
