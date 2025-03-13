/*
Задание 4 (тайминг 10 минут)
1.Реализуем метод добавления новых элементов в конец списка и удаление
последнего элемента связного списка.
2.Теперь, когда мы понимаем, как можно искать значения внутри связного списка,
мы можем сделать методы добавления и удаления элементов в конец нашего
односвязного списка
 */

//class List {
//    Node head;
//
//    class Node {
//        int value;
//        Node next;
//    }
//
//    public void pushFront(int value) {
//        Node node = new Node();
//        node.value = value;
//        node.next = head;
//        head = node;
//    }
//
//    public void popFront() {
//        if (head != null) {
//            head = head.next;
//        }
//    }
//
//    public void print() {
//        Node cur = head;
//        while (cur != null) {
//            System.out.printf("%d ", cur.value);
//            cur = cur.next;
//        }
//        System.out.println();
//    }
//
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
//    public void pushBack(int value) {
//        Node node = new Node();
//        node.value = value;
//
//        if (head == null) {
//            head = node;
//        } else {
//            Node cur = head;
//            while (cur.next != null) {
//
//                cur = cur.next;
//            }
//            cur.next = node;
//        }
//    }
//
//    public void popBack() {
//
//        if (head != null) {
//            if (head.next == null) {
//                head = null;
//            } else {
//                Node cur = head;
//                while (cur.next.next != null) {
//                    cur = cur.next;
//                }
//                cur.next = null;
//            }
//
//        }
//    }
//
//}


public class task_04 {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i <= 1; i++) {
            list.pushFront(i);
        }
//        list.print();

//        list.popFront();
//        list.popFront();

//        list.print();

//        System.out.println(list.consist(2));
//        System.out.println(list.consist(4));

//        list.pushBack(7);
//
//        list.print();
//
//        list.popBack();
//
//        list.print();
    }
}