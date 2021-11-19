package jasmine.jragon;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class OldBufferedQueueTest {
    private BufferedQueue<String> testList;
    private final String[] testBuffer = {"", "Purple", "Lexicon", "Ho Chi Minh City", "Delta Echo November", "List"};

    @Test
    void fullListTest(){
        testList = new BufferedQueue<>(testBuffer.length);
        assertFalse(testList.add(testBuffer[0]));
        assertFalse(testList.add(testBuffer[1]));
        assertFalse(testList.add(testBuffer[2]));
        assertFalse(testList.add(testBuffer[3]));
        assertFalse(testList.add(testBuffer[4]));
        assertTrue(testList.add(testBuffer[5]));
    }

    @Test
    void partialListTest(){
        testList = new BufferedQueue<>(testBuffer.length - 2);
        assertFalse(testList.add(testBuffer[0]));
        assertFalse(testList.add(testBuffer[1]));
        assertFalse(testList.add(testBuffer[2]));
        assertTrue(testList.add(testBuffer[3]));
        assertTrue(testList.add(testBuffer[4]));
        assertTrue(testList.add(testBuffer[5]));
    }

    @Test
    void removeFromHead(){
        testList = new BufferedQueue<>(testBuffer.length);
        assertFalse(testList.add(testBuffer[0]));
        assertFalse(testList.add(testBuffer[1]));
        assertFalse(testList.add(testBuffer[2]));
        assertFalse(testList.add(testBuffer[3]));
        assertFalse(testList.add(testBuffer[4]));
        assertTrue(testList.add(testBuffer[5]));

        IntStream.range(0, testList.getCapacity()).forEach(i -> {
            testList.removeFromHead(1);
            assertEquals(testList.getCapacity() - i - 1, testList.size());
        });
    }
}