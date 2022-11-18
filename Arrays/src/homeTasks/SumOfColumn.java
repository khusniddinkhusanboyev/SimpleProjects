package homeTasks;

import java.util.Arrays;

public class SumOfColumn {
    public static void main(String[] args) {
        int[][] array={{5,5,2,4},{8,5,9,2},{5,2,1,36}};
        System.out.print("Sum of column: " + Arrays.toString(sumOfColumn(array)));
     }
     public static int[] sumOfColumn(int[][] array){
        int[] newArray=new int[array.length];

         for (int i = 0; i < array.length ; i++) {
             int sum=0;
             for (int j = 0; j < array.length+1; j++) {
                 sum+=array[i][j];
             }
             newArray[i]=sum;

         }
         return newArray;
     }
}
