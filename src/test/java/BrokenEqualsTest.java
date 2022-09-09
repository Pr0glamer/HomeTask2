import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BrokenEqualsTest {


    @Test
    void testEqualsReflexive(){
        BrokenReflexive brokenReflexive = new BrokenReflexive();
        assertNotEquals(brokenReflexive.equals(brokenReflexive), true);
    }

    @Test
    void testEqualsSymmetry(){
        BrokenSymmetry brokenSymmetry = new BrokenSymmetry("Vasya");
        assertEquals(brokenSymmetry.equals("Vasya"), true);
        assertEquals("Vasya".equals(brokenSymmetry), false);
    }

    @Test
    void testEqualsTransitivity(){
        BrokenTransitivity brokenTransitivity = new BrokenTransitivity("Fedor");
        BrokenTransitivityChild brokenTransitivityChild = new BrokenTransitivityChild("Fedor", "Dvinyatin");
        BrokenTransitivityChild brokenTransitivityChild2 = new BrokenTransitivityChild("Fedor", "Dvinyatin");
        assertEquals(brokenTransitivity.equals(brokenTransitivityChild), true);
        assertEquals(brokenTransitivityChild.equals(brokenTransitivityChild2), true);
        assertEquals(brokenTransitivityChild2.equals(brokenTransitivity), false);
    }

}
