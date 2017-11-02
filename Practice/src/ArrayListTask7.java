import java.util.ArrayList;

public class ArrayListTask7 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                list2.add(list.get(i));
            }else{}
            if (list.get(i)%3==0){
                list3.add(list.get(i));
            }
        }

        for (int x :
                list2) {
            System.out.println(x);
        }
    }
}
