import java.util.Scanner;

public class ArraysTask6 {

    public static void main(String[] args) {

        int[] arr = new int[6];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        winner(arr);



    }
    public static void winner (int[] arr2) {

        int maxCountChet = 0;
        int maxCountNechet = 0;
        for (int i = 0; i < arr2.length; i++) {
        if (i%2==0) {
            maxCountChet += arr2[i];
            }
            else {maxCountNechet += arr2[i];}

        }
        if (maxCountChet> maxCountNechet){
            System.out.println("Winner is ODD "+ maxCountChet+" > " +maxCountNechet);
        }
        else {System.out.println("Winner is EVEN "+ maxCountNechet+" > " +maxCountChet);}
        }


}
