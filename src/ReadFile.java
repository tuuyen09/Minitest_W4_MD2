import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Contact> readFile(){
        List<Contact> contactList = new ArrayList<>();
        try {
            File file = new File("contact.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            contactList = (List<Contact>) ois.readObject();
        } catch (Exception e){
            e.printStackTrace();
        }
        return contactList;
    }
}
