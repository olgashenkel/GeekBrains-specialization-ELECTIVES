/* Задание 2. Реализация быстрой сортировки

1. На вход поступает целое число N из отрезка [1; 1000]
    и массив из N целых чисел.
2. Необходимо написать алгоритм быстрой сортировки массива
 */

public class task_02 {

    public static void main(String[] args) {
        int N = 10;
        int[] Array = new int[N];
        for (int i = 0; i < N; i++) {
            Array[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", Array[i]);
        }
        System.out.println();

        Sort(Array, 0, 9); // 1-ый вариант

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", Array[i]);
        }


        System.out.println();

        QuickSort(Array, 0, 9); // 2-ой вариант



        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", Array[i]);
        }

    }

    // 1-ый вариант (из лекции)
    public static void Sort(int[] Array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = Array[(startPosition + endPosition) / 2];
        do {
            while (Array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (Array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = Array[leftPosition];
                    Array[leftPosition] = Array[rightPosition];
                    Array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);
        if (leftPosition < endPosition) {
            Sort(Array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            Sort(Array, startPosition, rightPosition);
        }
    }

    // *******************************************************
    // 2-ой вариант (из семинара)

    public static void QuickSort(int[] Array) {
        QuickSort(Array, 0, Array.length - 1);
    }

    private static void QuickSort(int[] Array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = Array[(left + right) / 2];

        do {
            while (Array[i] < pivot){
                i++;
            }
            while (Array[j] > pivot){
                j--;
            }
            if(i <= j){
                if(i<j){
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if(left < j){
            QuickSort(Array, left, j);
        }
        if(i <= right){
            QuickSort(Array, i, right);
        }
    }

}
