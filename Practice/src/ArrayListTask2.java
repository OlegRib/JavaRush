import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
        }

        int maxStrLenght = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i).length() > maxStrLenght){

               maxStrLenght = list.get(i).length();
           }
        }

        for (String s :
                list) {
            if (s.length() == maxStrLenght) {
                System.out.println(s);
            }
        }

    }
}
