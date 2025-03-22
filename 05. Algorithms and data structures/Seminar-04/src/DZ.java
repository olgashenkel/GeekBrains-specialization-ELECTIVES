/*
Задание. Вывод красно-черного дерева.

Необходимо реализовать метод вывода на экран элементов красно-черного дерева,
визуально показав связи между родительскими и дочерними узлами. Узлы дерева, стоящие
на разном расстоянии от корневого узла выводить с разным отступом от начала строки
(корневой элемент без отступа, дети корня с отступом в четыре пробела, дети детей корня с
отступом в восемь пробелов, и так далее). Для решения этой задачи предполагается
использование рекурсивного алгоритма обхода дерева в глубину.
 */

public class DZ {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;
        Color color;
    }

    // Перечисление цвета
    enum Color {
        RED,
        BLACK
    }

    // Метод (public) вставки в бинарное дерево
    public void insert(int value) {
        if (root != null) {
            insert(root, value);
            root = balance(root);
        } else {
            root = new Node();
            root.value = value;
        }
        root.color = Color.BLACK;
    }


    // Метод (private) вставки в бинарное дерево
    private void insert(Node node, int value) {
        if (node.value != value) {
            if (node.value < value) {
                if (node.right == null) {
                    node.right = new Node();
                    node.right.value = value;
                    node.right.color = Color.RED;
                } else {
                    insert(node.right, value);
                    node.right = balance(node.right);
                }
            } else {
                if (node.left == null) {
                    node.left = new Node();
                    node.left.value = value;
                    node.right.color = Color.RED;
                } else {
                    insert(node.left, value);
                    node.left = balance(node.left);
                }
            }
        }
    }


    // Метод (public) для проверки на существование элемента (поиск элемента)
    public Node find(int value) {
        return find(root, value);
    }


    // Метод (private) для проверки на существование элемента (поиск элемента)
    private Node find(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (node.value == value) {
            return node;
        }
        if (node.value < value) {
            return find(node.right, value);
        } else {
            return find(node.left, value);
        }
    }


    // Метод левого поворота и перекрашивание
    private Node leftRotate(Node node) {
        Node cur = node.right;
        node.right = cur.left;
        cur.left = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }

    // Метод правого поворота и перекрашивание
    private Node rightRotate(Node node) {
        Node cur = node.left;
        node.left = cur.right;
        cur.right = node;
        cur.color = node.color;
        node.color = Color.RED;
        return cur;
    }


    // Метод смены цвета
    private void swapColors(Node node) {
        node.color = (node.color == Color.RED ? Color.BLACK : Color.RED);
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;
    }

    // Функция балансировки. Данная функция будет выравнивать дерево,
    // приводить его к сбалансированному виду,
    // при этом максимально уменьшая высоту максимально возможным способом
    private Node balance(Node node) {
        boolean flag = true;
        Node cur = node;
        do {
            flag = false;
            if (cur.right != null && cur.right.color == Color.RED && (cur.left == null || cur.left.color == Color.BLACK)) {
                cur = leftRotate(cur);
                flag = true;
            }

            if (cur.left != null && cur.left.color == Color.RED && cur.left.left != null && cur.left.left.color == Color.RED) {
                cur = rightRotate(cur);
                flag = true;
            }


            if (cur.left != null && cur.left.color == Color.RED && cur.right != null && cur.right.color == Color.RED) {
                swapColors(cur);
                flag = true;
            }
        } while (flag);
        return cur;
    }

    public void print() {
        print(root, 0);
    }

    private void print(Node node, int deep) {
        if (node == null) {
            return;
        }

        print(node.left, deep + 4);

        for (int i = 0; i < deep; i++) {
            System.out.print(" ");
        }
        System.out.println("value: " + node.value + " {color: " + node.color + "}");

        print(node.right, deep + 4);
    }
}
