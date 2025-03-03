/* Задание 1. Реализация простого алгоритма сортировки.

1. На вход поступает целое число N из отрезка [1; 1000]
    и массив из N целых чисел.
2. Необходимо написать один из простых алгоритмов сортировки массива:
    пузырьковую, вставками или выбором
 */

public class task_01 {

    public static void main(String[] args) {
        int N = 10;
        int[] Array = new int[N];
        for (int i = 0; i < N; i++) {
            Array[i] = (int) (Math.random()*100);
            System.out.printf("%d ", Array[i]);
        }
        System.out.println();

        BubbleSort(Array);

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", Array[i]);
        }
    }

    public static void BubbleSort(int[] Array) {
        boolean needSort = true;
        do {
            needSort = false;
            for (int i = 0; i < Array.length - 1; i++) {
                if(Array[i] > Array[i+1]){
                    int temp = Array[i];
                    Array[i] = Array[i+1];
                    Array[i+1] = temp;

                    needSort = true;
                }
            }
        } while (needSort);
    }

}
