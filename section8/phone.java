package section8;

public abstract class phone {
    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String oldPhone, String newPhone);
    public abstract Phonenumber searchPhone(String name);
    public abstract void sort();
}
