
package ru.tarasenco.classes;
import ru.tarasenko.classes.SortMode;
import ru.tarasenko.classes.Cube;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleka
 */
public class SortModeTest {
    /**
     * Тест метода compare класса SortMode.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        assertEquals(0, new SortMode(true,1).compare(new Cube(3,0,0), new Cube(3,0,0)));
    }
}
