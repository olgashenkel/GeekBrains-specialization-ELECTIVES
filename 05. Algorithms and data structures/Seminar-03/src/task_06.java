/*
Задание 6 (тайминг 10 минут)
1.Обновляем методы согласно новой структуре.
2.Появилась дополнительная переменная, которую необходимо отслеживать во
всех операциях.
3.Так же благодаря ссылке на последний элемент списка операции работы с
концом стали проще и их стоит заменить на логику аналогичную работе с
началом списка
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
//        if (tail == null) {
//            head = node;
//        } else {
//            tail.next = node;
//            node.prev = tail;
//        }
//        tail = node;
//    }
//
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
//}


public class task_06 {
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
