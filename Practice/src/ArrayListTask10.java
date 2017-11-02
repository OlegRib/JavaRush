import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask10 {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            list.add(scan.nextLine());
        }
        doubleWord(list);
    }
    public static void doubleWord(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)+" "+list.get(i));
        }
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
