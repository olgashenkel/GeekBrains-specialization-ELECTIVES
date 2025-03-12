/*
Односвязный список.
 */

public class task_03 {

    Node head;  // ссылка на первую ноду нашего списка

    public class Node {
        int value;
        Node next;  // передвижение по связанному списку вперед
    }

    // Рекурсивный метод разворота односвязного списка
    public void revert() {
        if (head != null && head.next != null){
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
