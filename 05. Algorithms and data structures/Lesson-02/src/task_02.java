/* Сортировка выбором

Так же очень простой алгоритм сортировки, который предполагает поиск
наименьшего (или наибольшего) значения правее от сравниваемого элемента. В
случае, если такой элемент найден – происходит перестановка с начальным
элементом.

Данный алгоритм очень похож на пузырьковую сортировку, за тем исключением,
что для его записи удобнее использовать не цикл while, а 2 циклов for, вложенные
друг в друга.
 */

public class task_02 {

    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }
            if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5};

        directSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
