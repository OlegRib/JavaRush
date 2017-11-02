import java.util.ArrayList;

public class ArrayListTask8 {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            list.add(i+"");
        }
        list.remove(3);

        int j;
        for (int i = 0; i < list.size();) {

            j=list.size()-1-i;
            System.out.println(list.get(j));
            i++;
        }
    }
}
