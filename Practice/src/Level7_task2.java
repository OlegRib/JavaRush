import java.util.ArrayList;
import java.util.Scanner;

public class Level7_task2 {

    public static void main(String[] args) {

        int n;
        int m;

        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        n = scan.nextInt();
        m = scan.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(i+"");
        }

        for (int i = 0; i < m; i++) {

            list.add(list.get(i));

        }

        for (int i = 0; i < m; i++) {
            list.remove(0);
        }


        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
