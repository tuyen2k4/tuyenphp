package section8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PhoneBook moi = new PhoneBook();

        moi.insertPhone("hoang","0376653703");
        moi.insertPhone("hoang","0176653704");
        moi.insertPhone("son","0176653705");
        moi.insertPhone("son","0176653705");
        Scanner sc =new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập số điện thoại: ");
        String phone= sc.nextLine();
        moi.insertPhone(name,phone);

        for (Phonenumber ln: moi.getPhoneListt()){
            System.out.println(ln.getName() + " : " + ln.getPhoneNumbers());

        }
        System.out.println("nhập tên muốn xóa đi: ");
        name=sc.nextLine();
        moi.removePhone(name);
        System.out.println("sau khi xóa : ");
        for (Phonenumber ln: moi.getPhoneListt()) {
            System.out.println(ln.getName() + ": " + ln.getPhoneNumbers());
        }

        System.out.println("Nhập tên muốn sửa: ");
        name =sc.nextLine();
        System.out.println("Nhập số điện thoại muốn sửa: ");
        phone= sc.nextLine();
        System.out.println("Nhập số điện thoại mới: ");
        String phonee= sc.nextLine();
        moi.updatePhone(name,phone,phonee);
        Phonenumber tk = moi.searchPhone(name);
        if (tk!= null) {
            System.out.println("tên sau khi sửa: " + tk.getName() + ": " + tk.getPhoneNumbers());
        } else {
            System.out.println(" không có tên người này này .");
        }



    }

}
