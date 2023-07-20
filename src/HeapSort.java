import java.util.ArrayList;
import java.util.List;

public class HeapSort {

    //Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

    private boolean shiftMaxInFamily(Integer[] arr, int indexRoot) {
        int indexLeft = (indexRoot * 2) + 1;
        int indexRight = (indexRoot * 2) + 2;

        if (arr[indexLeft] == null && arr[indexRight] == null) return false;

        if (arr[indexLeft] == null && arr[indexRight] != null) {
            if (arr[indexRoot] < arr[indexRight]) {
                int temp = arr[indexRoot];
                arr[indexRoot] = arr[indexRight];
                arr[indexRoot] = temp;
            }
        }
        if (arr[indexLeft] == null && arr[indexRight] != null) {
            if (arr[indexRoot] < arr[indexLeft]) {
                int temp = arr[indexRoot];
                arr[indexRoot] = arr[indexLeft];
                arr[indexRoot] = temp;
            }
        }

        if (arr[indexLeft] != null && arr[indexRight] != null) {
            int temp = arr[indexRoot];
            if (arr[indexRoot] < arr[indexLeft]) {
                arr[indexRoot] = arr[indexLeft];
                arr[indexLeft] = temp;
            }
            if (arr[indexRoot] < arr[indexRight]){
                arr[indexRoot] = arr[indexRight];
                arr[indexRight] = temp;
            }

        }
        return true;
    }

}
