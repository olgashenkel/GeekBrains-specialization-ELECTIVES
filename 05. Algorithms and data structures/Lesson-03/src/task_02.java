/*
Операции добавления и удаления элементов.

Разворот связного списка.

 */

public class task_02 {


    Node head;  // ссылка на первую ноду нашего списка
    Node tail; // ссылка на последнюю ноду нашего списка


    // Метод добавления элемента в конец связанного списка
    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    // Метод добавления элемента в середину связанного списка
    public void add(int value, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null) {
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;

        }
    }

    // Метод удаления элемента связанного списка
    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        } else {
            if (next == null) {
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }


    // Метод поиска в связанном списке
    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    // Метод разворота элемента связанного списка
    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }

            currentNode = next;

        }
    }

    public class Node {
        int value;
        Node next;  // передвижение по связанному списку вперед
        Node previous; // передвижение по связанному списку назад
    }
}
