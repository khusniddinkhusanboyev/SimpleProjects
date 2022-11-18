package MultiDimentionArry;

import java.util.Arrays;

public class MultiDimention {
    public static void main(String[] args) {
        //Multi dimension Array declared
        int[][] array=new int[2][4];
        int[][] arrays={{1,6,7,2},{4,8,9,6}};
        for(int i=0;i<2;i++){
            for (int j = 0; j < 4; j++) {
                array[i][j]=i+j;
            }
        }
        Arrays.stream(array).forEach(s->Arrays.stream(s).forEach(a-> System.out.print(a+" , ")));
        System.out.println();
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arrays[i][j]+" , ");
            }
            System.out.println();
        }
        System.out.println();
       

    }

}
