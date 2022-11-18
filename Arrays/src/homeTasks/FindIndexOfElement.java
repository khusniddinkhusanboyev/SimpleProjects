package homeTasks;

import java.util.Arrays;

public class FindIndexOfElement {
    public static void main(String[] args) {
    int[] ar={6,7,8,9,5,3};

        System.out.println("Element Index Number: " +findIndexOfElement(ar,9));
    }
    public static int findIndexOfElement(int[] array,int element){
        int indexNumber=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==element){
                indexNumber=i;
            }
        }
        return indexNumber;
    }
}
