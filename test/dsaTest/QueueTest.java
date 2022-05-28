package dsaTest;

import dsa.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void alwaysStartWith() {
        queue = new Queue();
    }

    @Test
    public void testThatQueueExist() {
        Queue queue = new Queue();
        assertNotNull(queue);
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatQueueCanPush() {
        queue.push("true");
        assertEquals(1, queue.size());
    }

    @Test
    public void testThatQueueCanPushMultipleElements() {
        queue.push("true");
        queue.push("tree");
        queue.push("tru");
        assertEquals(3, queue.size());
    }

    @Test
    public void testThatQueueCanPeekLastElementIn() {
        queue.push("true");
        queue.push("tree");
        queue.push("tru");
        String peeked = queue.peek();
        assertEquals("tru", peeked);
    }

    @Test
    public void testThatQueueCanPeekOtherElements() {
        queue.push("true");
        queue.push("tree");
        queue.push("tutu");
        queue.push("tru");
        String peeked = queue.peek(3);
        assertEquals("tutu", peeked);
    }

    @Test
    public void testThatQueueCanPopFirstElement() {
        queue.push("true");
        queue.push("tree");
        queue.push("tutu");
        queue.push("tru");
        String popped = queue.pop();
        assertEquals("true", popped);
    }

    @Test
    public void testThatQueueCanPopMoreThanOnce() {
        queue.push("true");
        queue.push("tree");
        queue.push("tutu");
        queue.push("tru");
        String popped = queue.pop();
        assertEquals("true", popped);
        String popped2 = queue.pop();
        assertEquals("tree", popped2);
    }

    @Test
    public void testThatQueueSizeReducesAfterPop() {
        queue.push("true");
        queue.push("tree");
        queue.push("tutu");
        queue.push("tru");
        queue.pop();
        queue.pop();
        assertEquals(2, queue.size());
    }

    @Test
    public void testThatQueueCanRefillNullArraysWhenLastIndexIsFilled() {
        queue.push("true");
        queue.push("tree");
        queue.push("tutu");
        queue.push("tru");
        queue.display();
        queue.pop();
        queue.pop();
        queue.display();
        queue.push("forest");
        queue.push("animals");
        queue.push("people");
        queue.display();
        assertEquals(5, queue.size());

    }
}
