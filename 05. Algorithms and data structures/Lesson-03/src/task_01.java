/*
Связный список

Связный список – базовая структура данных, состоящая из узлов, где каждый узел
содержит одну или две ссылки, который ссылаются на следующий или на
следующий и предыдущий узел соответственно.

 */

public class task_01 {
    Node head;  // ссылка на первую ноду нашего списка
    Node tail; // ссылка на последнюю ноду нашего списка

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

    public class Node {
        int value;
        Node next;  // передвижение по связанному списку вперед
        Node previous; // передвижение по связанному списку назад
    }
}
