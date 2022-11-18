package homeTasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.StringJoiner;

public class RemovingElement {
    public static void main(String[] args) {
        String[] array = {"Xusniddin", "ali", "vali", "zoyir"};
        System.out.println("Result" + Arrays.toString(removeElement(array, "Xusniddin")));
    }

    public static String[] removeElement(String[] array, String element) {
        /*Iterator<String> iterator=Arrays.asList(array).iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(element)){
                iterator.remove();
            }
        }*/
        String[] newArray = new String[array.length];
        String temp="";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                continue;
            }
            newArray[i] = array[i];


        }
        return newArray;
    }
}
