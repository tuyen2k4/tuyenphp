package section8;

import java.util.ArrayList;

public class Phonenumber {
    private String name;
    private ArrayList<String> phoneNumbers;

    public Phonenumber(String name) {
        this.name = name;
    }

    public Phonenumber(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Phonenumber(String name, ArrayList<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public Phonenumber() {

    }

    public void hienthii(){
        System.out.println(name+":"+phoneNumbers);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
