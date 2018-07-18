package com.semen.z.problem_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        assertEquals("left.left", solver.deserialize(solver.serialize(root)).left.left.data);
    }
}
