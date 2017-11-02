import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
        }

        int minStr =list.get(0).length();
        int maxStr =list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()> maxStr){
                maxStr = list.get(i).length();
            }else{}

            if (list.get(i).length()<minStr){
                minStr = list.get(i).length();
            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minStr){
                System.out.println("Minimu str length is "+list.get(i));
                break;
            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()==maxStr){
                System.out.println("Max str lenght is "+list.get(i));
                break;
            }

        }
    }
}
