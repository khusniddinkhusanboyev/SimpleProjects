package homeTasks;

import java.util.Scanner;

public class SpecificValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] arr=createArray();
        System.out.print(" Necessary word is:");
        String serch=scanner.nextLine();
        System.out.println(" Specific Value which is searching: "+searchElemenFromArray(arr,serch));

    }
    public static String[] createArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Input number of elements of array: ");
        int amount=scanner.nextInt();
         String[] newArray=new String[amount];
        for (int i = 0; i <newArray.length ; i++) {

            newArray[i]=scanner.nextLine();
        }
        return newArray;
    }
    public static String searchElemenFromArray(String[] searching, String searcher) {
        String set="";
        for (String word:searching) {
            if (word.contains(searcher)){
                set=searcher;
            }else {
                set="Topilmadi:";
            }
        }
        return set;
    }
}
