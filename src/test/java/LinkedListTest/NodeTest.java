package LinkedListTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
    @Test
    public void node_CanCreateANewNode() {
        // SETUP
        Node node = new Node();
        // ASSERT
        assertTrue(node instanceof Node);
    }

    @Test
    public void node_HasValueField(){
        //SETUP
        Node node = new Node();
        // EXCECUTION
        Object value = new Object();
        node.setValue(value);
        //ASSERT
        assertTrue(node.getValue() instanceof Object);
    }

    @Test
    public void node_HasNextField(){
        //SETUP
        Node node = new Node();
        // EXCEC
        Node next= new Node();
        node.setNext(next);
        //ASSERT
        assertTrue(node.getNext() instanceof Node);
    }
}
// Node values => type is object
// Node next => type is node
