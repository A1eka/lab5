
package ru.tarasenco.classes;
import ru.tarasenko.classes.Tetrahedron;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author aleka
 */
public class TetrahedronTest {
    /**
     * Тест метод getEdge класс Tetrahedron
     */
    @Test
    public void testGetEdge() {
        System.out.println("getEdge");
        assertEquals(2.0, new Tetrahedron(1.5,2,3.5,12).getEdge(), 0.00001);
    }
    /**
     * Тест метод getSumm класс Tetrahedron
     */
    @Test
    public void testGetSumm() {
        System.out.println("getSum");
        assertEquals(12.0, new Tetrahedron(1.5,2,3.5,12).getSum(), 0.00001);
    }
    /**
     * Тест метод getHight класс Tetrahedron
     */
    @Test
    public void testGetHight() {
        System.out.println("geHight");
        assertEquals(1.5, new Tetrahedron(1.5,2,3.5,12).getHig(), 0.0001);
    }
    
    
}
