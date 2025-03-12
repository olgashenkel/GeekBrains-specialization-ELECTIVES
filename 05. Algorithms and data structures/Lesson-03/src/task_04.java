/*
Связный список.

Стек и очередь.

 */

public class task_04 {


    Node head;  // ссылка на первую ноду нашего списка

    public class Node {
        int value;
        Node next;  // передвижение по связанному списку вперед
    }


    // Метод Push - добавление (положить) данные
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    // Метод Pop - извлечение данных
    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }


    // Рекурсивный метод разворота односвязного списка
    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }


}
