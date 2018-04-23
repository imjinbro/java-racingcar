package domain.result;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class CarResultTest {

    @Test
    public void position_sort() {
        LinkedList<CarResult> results = new LinkedList<>(Arrays.asList(new CarResult("jinbro", 5), new CarResult("colin", 1), new CarResult("jinhyung", 6)));
        Collections.sort(results);
        assertEquals("jinhyung", results.getFirst().getName());
    }
}