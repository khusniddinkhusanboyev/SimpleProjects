public class Sorting {

    public static void main(String[] args) {
        int[] mess={1,3,4,6,7,8,9};

        for (int j:sortArray(mess)
             ) {
            System.out.println(j);

        }
    }
    public  static int[] sortArray(int[] sorting) {
        int[] newArray=new int[sorting.length];
        int max;
        for (int i = 0; i < sorting.length; i++) {
            for (int j =i+1; j < sorting.length; j++) {
                if (sorting[i] < sorting[j]) {
                    max = sorting[i];
                    sorting[i] = sorting[j];
                    sorting[j] = max;
                    newArray[i]=max;
                }
            }     }

        return newArray;
    }

}
