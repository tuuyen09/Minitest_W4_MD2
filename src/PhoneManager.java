import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneManager extends Phone implements Iphone {
    private List<Contact> contactList = new ArrayList<>();


    @Override
    public void searchPhone(String name) {
        for (Contact c : contactList) {
            if (c.getName().equals(name)) {
                System.out.println(c);
            } else {
                System.err.println("Số điện thoại không tồn tại");
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(contactList, new sortContactList());
        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    @Override
    public void display(Type type) {
        if (type == null) {
            for (Contact c : contactList) {
                System.out.println(c);
            }
        } else {
            for (Contact c : contactList) {
                if (c.getType().equals(type)) {
                    System.out.println(c);
                }
            }
        }
    }

    @Override
    public void insertPhone(Contact contact) {
        for (Contact c : contactList) {
            if (c.getType().equals(contact.getType())) {
                c.setPhoneNumber(contact.getPhoneNumber());
            } else {
                contactList.add(contact);
            }
            WriteFile.writeFile(contactList);
        }
    }

    @Override
    public void removePhone(String name) {
        for (Contact c : contactList) {
            if (c.getName().equals(name)) {
                contactList.remove(c);
            } else {
                System.err.println("Số điện thoại không tồn tại");
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
       for (Contact c : contactList){
           if (c.getName().equals(name)){
               c.setPhoneNumber(newPhone);
           } else {
               System.err.println("Tên không ồn tại");
           }
       }
       WriteFile.writeFile(contactList);
    }
}
