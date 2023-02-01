package section8;

import section4.Phone;

import java.util.ArrayList;

public class PhoneBook extends phone {
    ArrayList<Phonenumber> PhoneListt;

    public ArrayList<Phonenumber> getPhoneListt() {
        return PhoneListt;
    }

    public void setPhoneListt(ArrayList<Phonenumber> phoneListt) {
        PhoneListt = phoneListt;
    }

    public PhoneBook() {
        PhoneListt = new ArrayList<>();
    }
    @Override
    public   void insertPhone(String name, String phone) {
        boolean isExist = false;
        for (Phonenumber pn : PhoneListt) {
            if (pn.getName().equals(name)) {
                isExist = true;
                if (!pn.getPhoneNumbers().contains(phone)) {
                    System.out.println();
                    pn.getPhoneNumbers().add(phone);
                }
                break;
            }
        }
        if (!isExist) {
            ArrayList<String> newPhoneNumbers = new ArrayList<>();
            newPhoneNumbers.add(phone);
            PhoneListt.add(new Phonenumber(name, newPhoneNumbers));
        }
    }
//        if (!Phonelistt.isEmpty()){
//            Phonelistt.add(name+", "+phone);
//
//        }else {
//            boolean kiemtra=false;
//
//            for (String moi: Phonelistt){
//                if (moi.contains(name+",")){
//                    kiemtra=true;
//                    if (!moi.contains(phone)){
//                        Phonelistt.set(Phonelistt.indexOf(moi),moi+" : "+ phone);
//                    }
//                    break;
//
//                }
//
//
//            }
//            if (!kiemtra){
//                Phonelistt.add(name+", "+phone);
//            }
//
//        }



    @Override
    public void removePhone(String name) {
        for (Phonenumber pn : PhoneListt) {
            if (pn.getName().equals(name)) {
                PhoneListt.remove(pn);
                break;
            }
        }

    }

    @Override
    public  void updatePhone(String name, String oldPhone, String newPhone) {
        for (Phonenumber pn : PhoneListt) {
            if (pn.getName().equals(name)) {
                int index = pn.getPhoneNumbers().indexOf(oldPhone);
                pn.getPhoneNumbers().set(index, newPhone);
                break;
            }
        }

    }

    @Override
    public Phonenumber searchPhone(String name) {
        for (Phonenumber pn : PhoneListt) {
            if (pn.getName().equals(name)) {
                return pn;
            }
        }
        return null;

    }

    @Override
    public void sort() {
        PhoneListt.sort((pn1, pn2) -> pn1.getName().compareTo(pn2.getName()));

    }


}
