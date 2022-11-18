package homeTasks;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array={1,2,3,5};
        System.out.println("result: "+Arrays.toString(sortArray(array)));
        String[] stringArray={"Xusniddin","Laylo","Ali","Xushnudbek","Muhammadillo","Muhammadrizo"};
        System.out.println("String Result: "+Arrays.toString(sortStringArray(stringArray)));
    }
    public static int[] sortArray(int[] array){
        //int max=array[0];
       // int[] newArray=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]>array[j]){
                    int max=array[j];
                    array[j]=array[i];
                    array[i]=max;
                }
            }
        }
        return array;
    }
    public static String[] sortStringArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length() > array[j].length()){
                    String temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        return array;
    }
}
