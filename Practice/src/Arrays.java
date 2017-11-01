import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int [] arr = new int[n];

        System.out.println("Введите "+n+"едементов массива");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max is "+max );
    }

}
