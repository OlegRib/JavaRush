import java.util.ArrayList;

public class ArrayListTask {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();


        for (int i = 0; i < 5; i++) {
            list.add(i);

        }
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
