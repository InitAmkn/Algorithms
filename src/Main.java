import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        HeapSort heap = new HeapSort();
        Integer[] arr = new Integer[15];

        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();

            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        heap.sort(arr);
        System.out.println(Arrays.toString(arr));


    }



}