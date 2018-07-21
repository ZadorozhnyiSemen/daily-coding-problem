package com.semen.z.problem_3;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class TreeSerialize {
    private static final String DELIMITER = ",";
    private static final String EMPTY_NODE = "NN";

    String serialize(Node<String> root) {
        StringBuilder sb = new StringBuilder();
        serialize(sb, root);
        return sb.toString();
    }

    private void serialize(StringBuilder sb, Node<String> root) {
        if (root == null) {
            sb.append(EMPTY_NODE).append(DELIMITER);
        } else {
            sb.append(root.data).append(DELIMITER);
            serialize(sb, root.left);
            serialize(sb, root.right);
        }
    }

    Node deserialize(String serialize) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(serialize.split(DELIMITER)));
        return deserialize(nodes);
    }

    private Node<String> deserialize(Deque<String> nodes) {
        String node = nodes.remove();
        if (node.equals(EMPTY_NODE)) {
            return null;
        } else {
            Node<String> parent = new Node<>(node);
            parent.left = deserialize(nodes);
            parent.right = deserialize(nodes);
            return parent;
        }
    }
}
