import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TestEqualsHashCode {


    @Test
    void testEqualsReflexive(){
        PersonWithBrokenReflexive brokenReflexive = new PersonWithBrokenReflexive("Helga");
        assertNotEquals(brokenReflexive.equals(brokenReflexive), true);


    }

    @Test
    void testEqualsSymmetry(){
        PersonWithBrokenSymmetry personWithbrokenSymmetry = new PersonWithBrokenSymmetry("Vasya");
        assertEquals(personWithbrokenSymmetry.equals("Vasya"), true);
        assertEquals("Vasya".equals(personWithbrokenSymmetry), false);

        Set set = new HashSet();
        set.add(personWithbrokenSymmetry);
        boolean result = set.contains("Vasya");
        assertFalse(result);
    }

    @Test
    void testEqualsTransitivity(){
        PersonWithBrokenTransitivity personWithBrokenTransitivity = new PersonWithBrokenTransitivity("Fedor");
        PersonWithBrokenTransitivityChild brokenTransitivityChild = new PersonWithBrokenTransitivityChild("Fedor", "Dvinyatin");
        PersonWithBrokenTransitivityChild brokenTransitivityChild2 = new PersonWithBrokenTransitivityChild("Fedor", "Dvinyatin");
        assertEquals(personWithBrokenTransitivity.equals(brokenTransitivityChild), true);
        assertEquals(brokenTransitivityChild.equals(brokenTransitivityChild2), true);
        assertEquals(brokenTransitivityChild2.equals(personWithBrokenTransitivity), false);

        Set<PersonWithBrokenTransitivity> set = new HashSet<>();
        set.add(personWithBrokenTransitivity);
        boolean result = set.contains(brokenTransitivityChild2);
        assertFalse(result);


        set = new HashSet<>();
        set.add(brokenTransitivityChild2);
        result = set.contains(brokenTransitivityChild);
        assertTrue(result);

    }

    @Test
    void testAllOk(){
        PersonAllOk allok = new PersonAllOk("Vasya");
        PersonAllOk allok2 = new PersonAllOk("Vasya");
        assertEquals(allok.equals(allok2), true);

        Set<PersonAllOk> set = new HashSet<>();
        set.add(allok);
        boolean result = set.contains(allok2);
        assertTrue(result);
    }

    @Test
    void testBrokenHash(){

        Set<PersonWithBrokenHashcode> set = new HashSet<>();
        PersonWithBrokenHashcode brokenHashcode = new PersonWithBrokenHashcode("Ivan");
        set.add(brokenHashcode);
        PersonWithBrokenHashcode equalBrokenHashcode = new PersonWithBrokenHashcode("Ivan");
        boolean result = set.contains(equalBrokenHashcode);
        assertFalse(result);


    }

}
