package MultiDimentionArry;

import java.util.ArrayList;

public class LisArray {
    public static void main(String[] args) {
        Dog dog1=new Dog("Rex",12);
        Dog dog2=new Dog("Olapar",5);
        Dog dog3=new Dog("To'rtko'z",14);
        Dog dog4=new Dog("alex",1);
        Dog dog5=new Dog("dima",17);
        Dog dog6=new Dog("bobik",7);

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(dog3);
        dogs.add(dog2);
        dogs.add(dog1);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);



        Dog dogx=dogs.get(0);
        for (Dog dog:dogs) {
            if (dogx.getName().length()<dog.getName().length()){
                dogx=dog;
            }
        }
        System.out.println(dogx.getName());
    }
}
