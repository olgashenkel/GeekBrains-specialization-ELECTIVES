/* Сортировка пузырьком

Один из наиболее простых алгоритмов сортировки массива – пузырьковая
сортировка. Нагляднее всего работу этого алгоритма можно продемонстрировать в
вертикальном массиве – наиболее легкие элементы стремятся вверх, словно
пузырьки воздуха в жидкости.

Базовый алгоритм предполагает, что каждый элемент необходимо сравнить с
соседним и, если правый элемент меньше левого, то их меняют местами. Алгоритм
повторяется до тех пор, пока все элементы в массиве не выстроятся в нужном
порядке.
 */

public class task_01 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5};

        bubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }

}