
/*
ЦИКЛИЧЕСКИЙ ОБХОД УЗЛОВ ДЕРЕВА.

ОБХОД В ШИРИНУ.
Чаще используется для какого-либо анализа,
либо для написания функции отрисовки

 */

import java.util.ArrayList;
import java.util.List;

public class task_02 {
    Node root;

    public class Node {
        int value;
        List<Node> children;
    }


    // приватная функция поиска необходимой ноды.
    // Данный метод использует циклы, а не рекурсию.

    private Node find(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }


    /*
    публичная функция, которая будет отображать поличилось/не получилось
    найти необходимую ноду и вернуть её значение
   */
    public boolean exist(int value) {
        if (root != null) {
            Node node = find(value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }


}