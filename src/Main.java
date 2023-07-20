import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            arr[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        sort(arr,0);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(Integer[] arr, int skipPosition){
        if (skipPosition == arr.length) return;
        for (int i = (arr.length-1)-skipPosition; i >= 0; i--) {
           shiftMaxInFamily(arr, i);
        }
        skipPosition++;

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        sort(arr, skipPosition);

    }
    public static boolean shiftMaxInFamily(Integer[] arr, int indexRoot) {
        int indexLeft = (indexRoot * 2) + 1;
        int indexRight = (indexRoot * 2) + 2;

        if (indexLeft >= arr.length && indexRight >= arr.length) return false;
        else {
            if (indexRight < arr.length) {
                if (arr[indexRoot] < arr[indexRight]) {
                    int temp = arr[indexRoot];
                    arr[indexRoot] = arr[indexRight];
                    arr[indexRight] = temp;
                }
            }
            if (indexLeft < arr.length) {
                if (arr[indexRoot] < arr[indexLeft]) {
                    int temp = arr[indexRoot];
                    arr[indexRoot] = arr[indexLeft];
                    arr[indexLeft] = temp;
                }
            }
        }

        if (indexLeft < arr.length && indexRight < arr.length) {
            int temp = arr[indexRoot];

            if (arr[indexRoot] < arr[indexRight]) {
                arr[indexRoot] = arr[indexRight];
                arr[indexRight] = temp;
                temp = arr[indexRoot];
            }
            if (arr[indexRoot] < arr[indexLeft]) {
                arr[indexRoot] = arr[indexLeft];
                arr[indexLeft] = temp;
                temp = arr[indexRoot];
            }
        }
        return true;
    }


}