import java.util.Scanner;

public class Main {
    static PhoneManager phoneManager = new PhoneManager();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("1. Thêm số điện thoại.");
            System.out.println("2. Hiển thị số điện thoại.");
            System.out.println("3. Sắp xếp danh bạ.");
            System.out.println("4. Xoá số điện thoại theo tên.");
            System.out.println("5. Sửa số điện thoại theo tên.");
            System.out.println("6. Tìm số điện thoại theo tên.");
            System.out.println("Nhập lựa chon của bạn.");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    insertPhone();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    update();
                    break;
                case 6:
                    search();
                    break;
            }
        }
    }
  public static void insertPhone (){
      Scanner input1 = new Scanner(System.in);
      System.out.println("Nhập tên: ");
      String name = input1.nextLine();
      Scanner input2 = new Scanner(System.in);
      System.out.println("Nhập số điện thoại: ");
      String phoneNumber = input2.nextLine();
      Scanner input3 = new Scanner(System.in);
      System.out.println("Nhập Id: ");
      int typeId = input3.nextInt();
      Scanner input4 = new Scanner(System.in);
      System.out.println("Nhập tên công ty: ");
      String typeName = input4.nextLine();
      Type type = new Type(typeId, typeName);
      Contact contact = new Contact(name, phoneNumber, type);
      phoneManager.insertPhone(contact);
  }
  public static void display (){
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập Id: ");
      int typeId = input.nextInt();
      System.out.println("Nhập tên công ty: ");
      String typeName = input.nextLine();
      Type type = new Type(typeId, typeName);
      phoneManager.display(type);

  }
  public static void sort(){
      phoneManager.sort();
  }
  public static void remove(){
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập tên cần xoá: ");
      String name = input.nextLine();
      phoneManager.removePhone(name);
  }
  public static void update (){
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập tên cần sửa: ");
      String name = input.nextLine();
      System.out.println("Nhập số điện thoại mới: ");
      String newPhone = input.nextLine();
      phoneManager.updatePhone(name, newPhone);
  }
  public static void search (){
      Scanner input = new Scanner(System.in);
      System.out.println("Nhập tên cần tìm: ");
      String name = input.nextLine();
      phoneManager.searchPhone(name);
  }
}
