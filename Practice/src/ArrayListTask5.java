import java.util.ArrayList;

public class ArrayListTask5 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();


        for (int i = 0; i < 5; i++) {
            list.add(i+ " ");
        }

        String m ="";
        for (int i = 0; i < 13; i++) {
            m = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            list.add(0,m);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


