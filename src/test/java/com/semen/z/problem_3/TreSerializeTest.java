package com.semen.z.problem_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TreSerializeTest {

    private TreeSerialize solver = new TreeSerialize();

    @Test
    void testTreeSerializer() {
        //
        //                  root
        //                 /    \
        //              left     right
        //             /    \     /  \
        //            /    null  /    \
        //      left.left      null   null
        Node<String> root = new Node<>("root",
                new Node<>("left",
                        new Node<>("left.left", null, null),
                        null),
                new Node<>("right", null, null));

        String serialize = solver.serialize(root);
        Node deserialize = solver.deserialize(serialize);
        assertNotNull(deserialize);
        assertEquals("left.left", deserialize.left.left.data);
    }
}
