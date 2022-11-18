import java.util.Arrays;
import java.util.Scanner;

public class MethodReference {
    public static void main(String[] args) {

        int[] arr={1,6,82,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }
    public static void reverse(int[] array){

        for (int i=0;i<array.length/2;i++){
          int num=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=num;
        }
        System.out.println(Arrays.toString(array));
    }
}
