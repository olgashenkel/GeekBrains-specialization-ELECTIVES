/*
Домашнее задание
Необходимо реализовать метод разворота связного списка
(двухсвязного или односвязного на выбор).
 */

class List {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;
        Node prev;
    }

    // Метод добавления элемента в начало списка
    public void pushFront(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }



    // Метод вывода элементов списка
    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }


    // Метод добавления элемента в конец списка
    public void pushBack(int value) {
        Node node = new Node();
        node.value = value;

        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
    }

    // Метод разворота двусвязного списка
    public void reverse(){
        Node node = head;
        while (node != null){
            Node next = node.next;
            Node prev = node.prev;
            node.next = prev;
            node.prev = next;

            node = node.prev;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }

}


public class DZ {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i <= 10; i++) {
            list.pushBack(i);
        }

        list.print();
        System.out.println();

        list.reverse();
        list.print();
    }
}
