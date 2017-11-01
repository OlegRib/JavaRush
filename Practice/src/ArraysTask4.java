public class ArraysTask4 {

    public static void main(String[] args) {

        int[] zrr = new int[10];
        int [] incerted = new int[10];

        for (int i = 0; i < zrr.length; i++) {
            zrr[i] = i;
        }

        int y = zrr.length-1;
        for (int i = 0; i < incerted.length; i++) {
            incerted[i] = zrr[y-i];
        }

        for (int x: incerted
             ) {
            System.out.println(x);
        }
    }
}
