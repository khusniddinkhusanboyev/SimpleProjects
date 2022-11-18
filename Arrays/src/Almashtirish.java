import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Almashtirish {
    public static void main(String[] args) {
        int[] array1 = {4, 6, 8, 2, 7,8,11,81,9};

        for (int i = 0; i < array1.length; i++) {
            //if (i < array1.length) {
                        for (int j = i + 1; j < array1.length; j++) {
                    if (array1[i] < array1[j]) {
                        int min = array1[i];
                        array1[i] = array1[j];
                        array1[j] = min;
              //      }

                }
            }
            System.out.println(array1[i]);

        }

    }
}


