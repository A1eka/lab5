
package ru.tarasenco.classes;
import ru.tarasenko.classes.Orb;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author aleka
 */
public class OrbTests {
    /**
     * Тест метод getX класс Orb
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        assertEquals(1.0, new Orb(4,12,1,1).getX(), 0.00001);
    }
    /**
     * Тест метод getY класс Orb
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        assertEquals(1.0, new Orb(4,12,1,1).getY(), 0.00001);
    }
    /**
     * Тест метод getLengh класс Orb
     */
    @Test
    public void testGetLendh() {
        System.out.println("geLengh");
        double l;
        l= 4*Math.PI;
        assertEquals(l, new Orb(4,l,1,1).getLengh(), 0.01);
    }
    
    
}
