import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask9 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            list.add(scan.nextLine());
        }

        fix(list);

    }
    public static void fix(ArrayList<String> listFix){
        for (int i = 0; i < listFix.size(); i++) {
            if (listFix.get(i).contains("r")){
                listFix.remove(i);
            }
            else{}
            if (listFix.get(i).contains("l")){
                listFix.set(i, listFix.get(i)+" "+ listFix.get(i));
            }

        }
        for (String s :
                listFix) {
            System.out.println(s);
        }
    }
}
