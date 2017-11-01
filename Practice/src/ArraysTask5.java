public class ArraysTask5 {

    public static void main(String[] args) {
        int [] arr = new int[10];
        int [] arr1 = new int[5];
        int [] arr2 = new int[5];

        for (int i = 0; i < arr.length; i++) {

            arr[i] =i;
         }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i <arr2.length ; i++) {
            arr2[i] =  arr[(arr.length -arr1.length) + i];
        }
        for (int x :
                arr2) {
            System.out.println(x);
        }

    }

}
