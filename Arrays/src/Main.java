import javax.swing.text.Element;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner arraySize=new Scanner(System.in);
        System.out.print("Input Size Of Array: ");
        int sizeOfArray=arraySize.nextInt();
        printArray(sortArray(getInteger(sizeOfArray)));


    }
    public  static int[] getInteger(int arr){
        Scanner krit=new Scanner(System.in);
        int[] array=new int[arr];
        for (int i=0;i<arr;i++){
            array[i]=krit.nextInt();
        }
        return array;
    }


   public  static int[] sortArray(int[] sorting) {
       for (int i = 0; i < sorting.length; i++) {
           for (int j =i+1; j < sorting.length; j++) {
               if (sorting[i] < sorting[j]) {
                    int max = sorting[i];
                   sorting[i] = sorting[j];
                   sorting[j] = max;
               }
           }
       }
        return sorting;
   }




    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Element "+i+" Content "+array[i]);
            }
        }

    }


