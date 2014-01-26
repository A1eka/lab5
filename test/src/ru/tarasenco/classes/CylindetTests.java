

package ru.tarasenco.classes;
import ru.tarasenko.classes.Cylinder;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleka
 */
public class CylindetTests {
    
   /**
     * Тест метод getRad класс Cylinder
     */
    @Test
    public void testGetRad() {
        System.out.println("getSumm");
        assertEquals(1.0, new Cylinder(3,1,2.8).getRad(), 0.00001);
    }
    /**
     * Тест метод getHight класс Cylinder
     */
    @Test
    public void testGetHig() {
        System.out.println("getHig");
        assertEquals(3.0, new Cylinder(3,1,2.8).getHig(), 0.00001);
    }
    /**
     * Тест метод getArea_Body класс Cylinder
     */
    @Test
    public void testArea_Body() {
        System.out.println("geArea_Body");
        assertEquals(6.0, new Cylinder(3,2,2.8).getArea_Body(), 0.00001);
    }
}
