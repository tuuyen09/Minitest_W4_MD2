import java.io.*;
import java.util.List;

public class WriteFile {
    public static void writeFile (List<Contact> contactList){
        File file = new File("contact.txt");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(contactList);
            os.close();
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
