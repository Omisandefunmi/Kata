package dsaTest;

import dsa.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp(){
        queue = new Queue();
    }

    @Test
    public void testThatQueueExist(){
        assertNotNull(queue);
    }

    @Test
    public void queueIsEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void pushElement_QueueNotEmpty(){
        queue.push("first guy in Otunba");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void pushElement_popElement_QueueIsEmpty(){
        queue.push("first guy in");
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void pushElement_peekElement(){
        queue.push("first");
        String peek = queue.peek();
        assertEquals("first", peek);
    }

    @Test
    public void pushTwoElements_peekLastElement(){
        queue.push("first");
        queue.push("second");
        assertEquals("second", queue.peek());
    }

    @Test
    public void queueCanPeekByIndex(){
        queue.push("first");
        queue.push("second");
        queue.push("third");
        queue.push("fourth");
        assertEquals("third", queue.peek(3));
    }

    @Test
    public void queueSizeCorrespondsWithElementsContainedTest(){
        queue.push("first");
        queue.push("second");
        queue.push("second");
        assertEquals(3, queue.size());
    }

    @Test
    public void pushElements_PopOnlyFirstElement(){
        queue.push("first");
        queue.push("second");
        queue.push("third");
        queue.push("fourth");
        String popped = queue.pop();
        assertEquals("first", popped);
        assertNotNull(queue.peek(1));
        String peeked = queue.peek(1);
        assertEquals("second", peeked);
    }


    @Test
    public void otherElementsInQueueAdjustAfterPop(){
        queue.push("first");
        queue.push("second");
        queue.push("third");
        queue.push("fourth");
        queue.pop();
        assertEquals("second", queue.peek(1));
        queue.pop();
        assertEquals("third", queue.peek(1));
    }

    @Test
    public void overwriteLastElementIfQueueIsFilledTest(){
        queue.push("first");
        queue.push("second");
        queue.push("third");
        queue.push("fourth");
        queue.push("fifth");
        assertEquals(5, queue.size());
        queue.push("sixth");
        assertEquals(5, queue.size());
    }
}
