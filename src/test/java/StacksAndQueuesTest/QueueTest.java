package StacksAndQueuesTest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;

    @BeforeEach
    public void setQueue() {
        queue = new Queue();
    }

    @Test
    public void queue_HasFirstField() {
        // SETUP
        Node node = new Node();
        node.setValue("first");
        String expected = "first";
        // EXEC
        queue.setFirst(node);
        String actual = (String) queue.getFirst().getValue();
        // ASSERT
        assertEquals(expected, actual, "it should return the string 'first'");
    }

    @Test
    public void queue_HasLastField() {
        // SETUP
        Node node = new Node();
        node.setValue("last");
        String expected = "last";
        // EXEC
        queue.setLast(node);
        String actual = (String) queue.getLast().getValue();
        // ASSERT
        assertEquals(expected, actual, "it should return the string 'last'");
    }

    @Test
    public void queue_HasADefaultSizeOfZero() {
        //SETUP
        int expected = 0;

        // EXECUTION
        int actual = queue.getSize();

        assertEquals(expected, actual, "it should return 0 for an empty queue");
    }

    @Test
    public void queue_returnsTrueIfItsEmpty(){
        //SETUP && Execution
        boolean actual = queue.isEmpty();
        // Assert
        assertTrue(actual,"it should return true for an empty queue");
    }

    @Test
    public void queue_returnsFalseIfItsNotEmpty(){
        //SETUP
        queue.setFirst(new Node());
        // Execution
        boolean actual = queue.isEmpty();
        // Assert
        assertFalse(actual,"it should return false for a non-empty queue");
    }

    @Test
    public void queue_addTwoItemsToQueue() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        int expected = 2;
        // EXEC
        queue.add(first);
        queue.add(second);
        int actual = queue.getSize();
        // ASSERT
        assertEquals(expected, actual, "it should return a size of two");
    }

    @Test
    public void queue_addTwoItemsAndObtainCorrectFirstItem() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        // EXEC
        queue.add(first);
        queue.add(second);
        Object actual = queue.getFirst().getValue();
        // ASSERT
        assertEquals(first, actual, "it should return the correct 1st object");
    }

    @Test
    public void queue_addTwoItemsAndObtainCorrectLastItem() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        // EXEC
        queue.add(first);
        queue.add(second);
        Object actual = queue.getLast().getValue();
        // ASSERT
        assertEquals(second, actual, "it should return the last object");
    }

    @Test
    public void queue_peekReturnsNullForEmptyQueue() {
        // ACTUAL
        assertNull(queue.peek(), "it should return null");
    }

    @Test
    public void queue_peekReturnsTheFirstValueForAQueueWithTwoItems() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        // EXEC
        queue.add(first);
        queue.add(second);
        Object actual = queue.peek();
        // ASSERT
        assertEquals(first, actual, "it should return the correct 1st object");
    }

    @Test
    public void queue_removeReturnsNullForAnEmptyQueue() {
        //ACTUAL
        assertNull(queue.remove(), "it should return null");
    }

    @Test
    public void queue_removeReturnsTheFirstValueForAQueueWithTwoItems() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        // EXEC
        queue.add(first);
        queue.add(second);
        Object actual = queue.peek();
        // ASSERT
        assertEquals(first, actual, "it should return the correct 1st object");
    }

    @Test
    public void queue_removeReturnsTheFirstItem() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        queue.add(first);
        queue.add(second);
        // EXEC
        Object actual = queue.remove();
        // ASSERT
        assertEquals(first, actual, "it should return the 'first' object");
    }

    @Test
    public void queue_removeSetsFirstAndLastToSameValueAfterRemoval() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        queue.add(first);
        queue.add(second);
        queue.remove();
        Object expected = queue.getFirst().getValue();
        // EXEC
        Object actual = queue.getLast().getValue();
        // ASSERT
        assertEquals(expected, actual, "it should return the same value");
    }

    @Test
    public void queue_removeSetsFirstAndLastToNullForQueueWithOneItem() {
        // SETUP
        Object first = new Object();
        Object second = new Object();
        queue.add(first);
        queue.remove();
        // EXEC
        Object actualFirst = queue.getFirst();
        Object actualLast = queue.getLast();
        // ASSERT
        assertNull(actualFirst, "it should return null");
        assertNull(actualLast, "it should return null");
    }

}
