package MultiDimentionArry;

import java.util.Arrays;

public class TwoDeminisionArray {
    public static void main(String[] args) {

        int[][] array={{1,3,6},{9,7,3}};
        System.out.println("Max value of twice dimension:"+maxValue(array));

    }
    //[ [1,3,6],[9,7,3]]
    public static int maxValue(int[][] array){
        int max=array[0][1];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (max<=array[i][j]){
                    max=array[i][j];
                }
            }
        }
       return max;
        //int element=Arrays.stream(array).forEach(s->Arrays.stream(s).forEach(k->element));
    }
}
