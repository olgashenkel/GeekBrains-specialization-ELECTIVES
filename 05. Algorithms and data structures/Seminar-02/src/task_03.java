/* Задание 3. Выполнить сравнение времени выполнения

1. Сравните время работы алгоритмов из задач 1 и 2.
2. Для сравнения в языке java усть класс Date с методом getTime().
 */

import java.util.Date;

public class task_03 {

    public static void main(String[] args) {
        int N = 20000;
        int[] Array1 = new int[N];
        int[] Array2 = new int[N];

        for (int i = 0; i < N; i++) {
            Array1[i] = (int) (Math.random() * 100);
            Array2[i] = Array1[i];
            System.out.printf("%d ", Array1[i]);
        }

        System.out.println();
        Date start = new Date();
        QuickSort(Array1);
        Date end = new Date();
        long time1 = end.getTime() - start.getTime();

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", Array1[i]);
        }


        System.out.println();
        start = new Date();
        BubbleSort(Array2);
        end = new Date();
        long time2 = end.getTime() - start.getTime();


        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", Array2[i]);
        }

        System.out.println();
        System.out.printf("\ntime1 = %dms (сортировка QuickSort), \ntime2 = %dms (сортировка BubbleSort)\n", time1, time2);


    }

    // ***************************************************************
    //                          Задача 1
    // ***************************************************************


    public static void BubbleSort(int[] Array) {
        boolean needSort = true;
        do {
            needSort = false;
            for (int i = 0; i < Array.length - 1; i++) {
                if (Array[i] > Array[i + 1]) {
                    int temp = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = temp;

                    needSort = true;
                }
            }
        } while (needSort);
    }


    // ***************************************************************
    //                          Задача 2
    // ***************************************************************
    public static void QuickSort(int[] Array) {
        QuickSort(Array, 0, Array.length - 1);
    }

    private static void QuickSort(int[] Array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = Array[(left + right) / 2];

        do {
            while (Array[i] < pivot) {
                i++;
            }
            while (Array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) {
            QuickSort(Array, left, j);
        }
        if (i <= right) {
            QuickSort(Array, i, right);
        }
    }


}
