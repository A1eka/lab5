
package ru.tarasenco.classes;
import ru.tarasenko.classes.Cube;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleka
 */
public class CubeTests {
    /**
     * Тест метод getSumm класс Cube
     */
    @Test
    public void testGetSumm() {
        System.out.println("getSumm");
        assertEquals(12.0, new Cube(1,12,1.5).getSum(), 0.00001);
    }
    /**
     * Тест метод getHight класс Cube
     */
    @Test
    public void testGetHig() {
        System.out.println("getHig");
        assertEquals(1.0, new Cube(1,12,1.5).getHig(), 0.00001);
    }
    /**
     * Тест метод getDiag класс Cube
     */
    @Test
    public void testGetDiag() {
        System.out.println("geDdiag");
        double l;
        l= Math.sqrt(3);
        assertEquals(l, new Cube(1,12,l).getDiag(), 0.00001);
    }
    
}
