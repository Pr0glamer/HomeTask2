import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class BrokenHashCodeTest {

    @Test
    void testBrokenHash(){

        Set<BrokenHashcode> set = new HashSet<>();
        BrokenHashcode brokenHashcode = new BrokenHashcode("Test");
        set.add(brokenHashcode);
        BrokenHashcode equalBrokenHashcode = new BrokenHashcode("Test");
        boolean result = set.contains(equalBrokenHashcode);
        assertFalse(result);


    }

}
