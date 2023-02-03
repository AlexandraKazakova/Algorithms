import java.util.Objects;
import java.util.function.Consumer;

public class Tree<T extends Comparable<T>> {

    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<>();

        int[] array = new int[]{10, 2, 7, 5, 12, 1, 15, 3, 8, 11, 22, 18, 0, 4, 30, 13};

        for (int item : array) {
            tree.add(item);
        }

        tree.dfs(it -> System.out.print(it + " "));

        System.out.println(tree.contains(13));

        tree.dfs(it -> System.out.print(it + " "));
    }

    private Node root;

    private class Node {
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }

    public void dfs(Consumer<T> valueAcceptor) {
        dfs(root, valueAcceptor);
    }

    private void dfs(Node current, Consumer<T> valueAcceptor) {
        valueAcceptor.accept(current.value);
        if (current.left != null) {
            dfs(current.left, valueAcceptor);
        }
        if (current.right != null) {
            dfs(current.right, valueAcceptor);
        }
    }

    public void add(T value) {
        Objects.requireNonNull(value);
        root = appendNode(root, value);
    }

    private Node appendNode(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }

        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = appendNode(current.left, value);
        } else if (compare > 0) {
            current.right = appendNode(current.right, value);
        }

        return current;
    }

    public boolean contains(T value) {
        boolean s = false;
        if (!(root.value == value)) {
            int compare = value.compareTo(root.value);
            if (compare < 0) {
                if (root.left == null) {
                    return s;
                }
                root = root.left;
                contains(value);
            }
            if (compare > 0) {
                if (root.right == null) {
                    return s;
                }
                root = root.right;
                contains(value);
            }
        }
        if (root.value == value) {
            s = true;
        }
        return s;
    }

//    public boolean containsV1(Node current, T value) {
//        boolean s = false;
//        if (!(current.value == value)) {
//            int compare = value.compareTo(current.value);
//            if (compare < 0) {
//                if (current.left == null) {
//                    return s;
//                }
//                containsV1(current.left, value);
//            }
//            if (compare > 0) {
//                if (current.right == null) {
//                    return s;
//                }
//                containsV1(current.right, value);
//            }
//        }
//        if (current.value == value) {
//            s = true;
//        }
//        return s;
//    }
}
