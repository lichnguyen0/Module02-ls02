package refactoringtachphuongthuc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class CylinderTest {

    @Test
    public void testVolume_case1() {
        // radius = 1, height = 1
        double expected = Cylinder.getPerimeter(1) * 1 + 2 * Cylinder.getBaseArea(1);
        double actual = Cylinder.getVolume(1, 1);
        assertEquals(expected, actual, 1e-9);
    }

    @Test
    public void testVolume_case2() {
        // radius = 2, height = 5
        double expected = Cylinder.getPerimeter(2) * 5 + 2 * Cylinder.getBaseArea(2);
        double actual = Cylinder.getVolume(2, 5);
        assertEquals(expected, actual, 1e-9);
    }

    @Test
    public void testVolume_case3() {
        // radius = 0, height = 10
        double expected = Cylinder.getPerimeter(0) * 10 + 2 * Cylinder.getBaseArea(0);
        double actual = Cylinder.getVolume(0, 10);
        assertEquals(expected, actual, 1e-9);
    }

    @Test
    public void testVolume_case4() {
        // radius = 3, height = 7
        double expected = Cylinder.getPerimeter(3) * 7 + 2 * Cylinder.getBaseArea(3);
        double actual = Cylinder.getVolume(3, 7);
        assertEquals(expected, actual, 1e-9);
    }
}
