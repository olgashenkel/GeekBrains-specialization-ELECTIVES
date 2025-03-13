/*
Задание 7 (тайминг 15 минут)
1.Добавляем метод сортировки для связного списка.
2.Можно использовать любой алгоритм, что мы использовали на предыдущем
семинаре, но с точки зрения работы связного списка лучше ориентироваться на
пузырьковую сортировку, т.к. она взаимодействует с соседними элементами, а
не только по индексам, как делают все остальные сортировки.
 */

//class List {
//    Node head;
//    Node tail;
//
//    class Node {
//        int value;
//        Node next;
//        Node prev;
//    }
//
//    // Метод добавления элемента в начало списка
//    public void pushFront(int value) {
//        Node node = new Node();
//        node.value = value;
//        if (head == null) {
//            tail = node;
//        } else {
//            node.next = head;
//            head.prev = node;
//        }
//        head = node;
//    }
//
//
//    // Метод удаления элемента в начале списка
//    public void popFront() {
//        if (head != null) {
//            if (head.next == null) {
//                head = null;
//                tail = null;
//            } else {
//                head = head.next;
//            }
//        }
//    }
//
//    // Метод вывода элементов списка
//    public void print() {
//        Node cur = head;
//        while (cur != null) {
//            System.out.printf("%d ", cur.value);
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//
//    // Метод поиска нужного элемента списка
//    public boolean consist(int value) {
//        Node cur = head;
//        while (cur != null) {
//            if (cur.value == value) {
//                return true;
//            }
//            cur = cur.next;
//        }
//        return false;
//    }
//
//    // Метод добавления элемента в конец списка
//    public void pushBack(int value) {
//        Node node = new Node();
//        node.value = value;
//
//        if (tail == null) {
//            head = node;
//        } else {
//            tail.next = node;
//            node.prev = tail;
//        }
//        tail = node;
//    }
//
//    // Метод удаления элемента в конце списка
//    public void popBack() {
//
//        if (tail != null) {
//            if (tail.prev == null) {
//                head = null;
//                tail = null;
//            } else {
//                tail = tail.prev;
//            }
//        }
//    }
//
//    // Метод сортировки элементов списка
//    public void sort() {
//        boolean needSort = true;
//        do {
//            needSort = false;
//            Node node = head;
//            while (node != null && node.next != null) {
//                if (node.value > node.next.value) {
//                    Node before = node.prev;
//                    Node cur = node;
//                    Node next = node.next;
//                    Node after = node.next.next;
//
//                    cur.prev = next;
//                    cur.next = after;
//                    next.prev = before;
//                    next.next = cur;
//
//                    if (before != null) {
//                        before.next = next;
//                    } else {
//                        head = next;
//                    }
//
//                    if (after != null) {
//                        after.prev = cur;
//                    } else {
//                        tail = cur;
//                    }
//                    needSort = true;
//                }
//                node = node.next;
//            }
//        } while (needSort);
//    }
//}
//
public class task_07 {
    public static void main(String[] args) {
//        List list = new List();
//        for (int i = 1; i <= 10; i++) {
//            list.pushFront(i);
//        }
////        list.print();
//
////        list.popFront();
////        list.popFront();
//
////        list.print();
//
////        System.out.println(list.consist(2));
////        System.out.println(list.consist(4));
//
////            list.pushBack(7);
////
////            list.print();
////
////            list.popBack();
//
////            list.sort();
//        list.print();
    }
}


