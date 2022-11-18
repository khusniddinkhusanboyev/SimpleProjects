package homeTasks;

import java.util.Scanner;

public class AverageValueOfArrayElements {
    public static void main(String[] args) {
        System.out.println("Average Of Elements Of Array: "+averageValeuOfElements(enteredElements()));

    }
    public static int[] enteredElements(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(  " Input Element Number: ");
        int amount=scanner.nextInt();
        int[] newArray=new int[amount];
        for (int i = 0; i <newArray.length ; i++) {
            newArray[i]=scanner.nextInt();
        }
        return newArray;
    }
    public static double averageValeuOfElements(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int averageValue=sum/arr.length;
        return averageValue;
    }
}
