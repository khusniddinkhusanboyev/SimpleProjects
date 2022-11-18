package homeTasks;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {

        int[] arr=enteredElemenByConsole(elements());
       sumOfElements(arr);

    }
    public static int elements(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number of elements: ");
         int x=scanner.nextInt();
        return x;
    }

    public static int[] enteredElemenByConsole(int sizeOfArray){
        Scanner scanner=new Scanner(System.in);
        int[] newArray=new int[sizeOfArray];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=scanner.nextInt();
        }
        scanner.close();
        return newArray;
    }
    public static void sumOfElements(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(" Sum Of Elements Of Array: "+sum);

    }
}
