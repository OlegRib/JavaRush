import java.util.Scanner;

public class ArraysTask2 {

    public static void main(String[] args) {


        String [] arr = new String[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 8 ; i++) {
            arr[i] = scan.nextLine();
        }

        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }

    }
}
