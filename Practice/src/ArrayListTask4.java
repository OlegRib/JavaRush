import java.util.ArrayList;

public class ArrayListTask4 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(0," "+i);
        }

        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
