package homeTasks;

import java.util.Scanner;

public class GridPrinting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Biror Qiymat Kriting: ");
        String key=scanner.next();
        System.out.println(gridLayout(key));
    }
    public static String gridLayout(String text){
        String x="";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(text);
            }
            System.out.println("");

            }
        return x;
    }
}
