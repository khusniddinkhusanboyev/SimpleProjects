package MobilePhone;
import java.util.ArrayList;
public class mobilePhone {
    private Contact contact;
    private String myNumber;
    private  ArrayList<Contact> myContacts;
    public mobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts=new ArrayList<>();
    }
    public boolean addNewContact(Contact contact){
        if (myContacts.contains(contact)){
            return false;
        }else {
            return myContacts.add(contact);
        }
    }
    public boolean updateContact(Contact old,Contact newContact){
        Contact oldContact=old;
        if (myContacts.contains(old)){
          oldContact=newContact;
        }
       return myContacts.add(oldContact);
    }
    public boolean removeContact(Contact exsistContact){

       return myContacts.remove(exsistContact);
    }
    public int findContact(Contact exsistContact){

       return myContacts.indexOf(exsistContact);
    }
    public int findContact(Contact exsistContact, String name){

        return myContacts.indexOf(exsistContact);
    }
    public String getMyNumber() {
        return "My phone number is: "+myNumber;
    }
    public Contact queryContact(String name){
        if (myContacts.contains(name)){
            return contact;
        }else{
            return null;
        }
    }
    public String printContacts(String name){
        String ism="";
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)){
                ism=myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber();
            }
        }
        return ism;
    }






}
