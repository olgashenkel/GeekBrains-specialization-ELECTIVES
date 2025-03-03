/* Домашнее задание/

Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
 */

public class DZ_01 {

    public static void main(String[] args) {
        int N = 20;
        int[] Array = new int[N];

        for (int i = 0; i < N; i++) {
            Array[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }

        System.out.println();
        sort(Array);

        for (int i = 0; i < N; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (i != largest) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }

    }

}
