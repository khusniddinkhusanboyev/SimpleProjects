package MobilePhone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner create=new Scanner(System.in);
        System.out.print("Name: ");
        String name=create.nextLine();
        System.out.print("Number: ");
        String number=create.nextLine();
        create.close();

        Contact contact2=new Contact(name,number);
        Contact contact=new Contact("Bob","+31415926");
        Contact contact1=new Contact("Alice","+16180339");
        Contact contact3=new Contact("Tom","+11235813");
        Contact contact4=new Contact("Jane","+23571113");
        Contact contact5=new Contact("Ann","+58771113");
        Contact contact6=new Contact("aaaaa","+8888888");


        mobilePhone mobilePhone=new mobilePhone("+998978117074");

        mobilePhone.addNewContact(contact);
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);
        mobilePhone.addNewContact(contact5);
        /*System.out.println(mobilePhone.addNewContact(contact));
        System.out.println(mobilePhone.addNewContact(contact3));
        System.out.println(mobilePhone.removeContact(contact));
        System.out.println(mobilePhone.findContact(contact1));
        System.out.println(mobilePhone.findContact(contact1,contact1.getName()));
        System.out.println(mobilePhone.updateContact(contact, contact6));*/
        System.out.println(mobilePhone.getMyNumber());
        System.out.println(mobilePhone.queryContact(contact.getName()));
        System.out.println(mobilePhone.queryContact(contact1.getName()));
        System.out.println(mobilePhone.queryContact(contact2.getName()));
        System.out.println(mobilePhone.queryContact(contact3.getName()));
        System.out.println(mobilePhone.queryContact(contact4.getName()));
        System.out.println(mobilePhone.queryContact(contact5.getName()));
        System.out.println(mobilePhone.queryContact(contact6.getName()));

    }

}
