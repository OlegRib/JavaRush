public class Lesson7_task3 {

    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            } else{}
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
