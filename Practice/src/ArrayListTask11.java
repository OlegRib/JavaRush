import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask11 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> lenghtNumber = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
            lenghtNumber.add(list.get(i).length());
        }

        for (int i = 0; i < list.size()-1; i++) {
            if (lenghtNumber.get(i) > lenghtNumber.get(i+1)){
                System.out.println(list.indexOf(list.get(i+1)));

                break;
            }

        }
    }
}
