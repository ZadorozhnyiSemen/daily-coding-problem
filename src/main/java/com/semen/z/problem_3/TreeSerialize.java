package com.semen.z.problem_3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class TreeSerialize {
    private static final String DELIMITER = ",";
    private static final String EMPTY_NODE = "NN";

    @NotNull
    String serialize(@Nullable Node<String> root) {
        StringBuilder sb = new StringBuilder();
        serialize(sb, root);
        return sb.toString();
    }

    private void serialize(@NotNull StringBuilder sb, @Nullable Node<String> root) {
        if (root == null) {
            sb.append(EMPTY_NODE).append(DELIMITER);
        } else {
            sb.append(root.data).append(DELIMITER);
            serialize(sb, root.left);
            serialize(sb, root.right);
        }
    }

    @Nullable
    Node deserialize(@NotNull String serialize) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(serialize.split(DELIMITER)));
        return deserialize(nodes);
    }

    @Nullable
    private Node<String> deserialize(@NotNull Deque<String> nodes) {
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
