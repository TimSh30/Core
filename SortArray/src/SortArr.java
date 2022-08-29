import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int oporVar = array[middle];
        int i = low, j = high;

        while (i <= j) {
            while (array[i] < oporVar) {
                i++;
            }

            while (array[j] > oporVar) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
