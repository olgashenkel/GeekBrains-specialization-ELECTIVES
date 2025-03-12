/*
Связный список.

Очередь (на примере двусвязного списка, т.к. необходимо будет извлекать
последний элемент очереди).

 */

public class task_05 {


    Node head;  // ссылка на первую ноду нашего списка
    Node tail; // ссылка на последнюю ноду нашего списка

    public class Node {
        int value;
        Node next;  // передвижение по связанному списку вперед
        Node previous; // передвижение по связанному списку назад
    }


    // Метод Push - добавление (положить) данные
    // (данный метод не изменяется, остается таким же, как и в стеке)
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;   // единственное отличие от метода в стеке
        head = node;
    }

    // Метод Peek - классический метод для очереди,
    // который позволяет извлечь последний элемент очереди,
    // что и соответствует принципу FIFO
    public Integer peek(){
        Integer result = null;
        if(tail != null){
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
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
