import java.util.Scanner;

public class ArraysTask3 {

    public static void main(String[] args) {

        String[] list = new String[10];
        int [] arr = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextLine();
        }

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = list[i].length();
        }
        for (int x:arr
             ) {
            System.out.println(x);
        }
    }
}
