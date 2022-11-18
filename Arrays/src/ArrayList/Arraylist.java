package ArrayList;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        Person person=new Person("Xusniddin","Xusanboyev");
        Person person1=new Person("Xushnudbek","Axmadaliyev");

        ArrayList<Person> persons=new ArrayList<>();
        persons.add(person);
        persons.add(person1);


        System.out.println(persons.size());
        persons.remove(person1);
        System.out.println(persons.size());
        persons.clear();
        System.out.println(persons.size());


    }
}
