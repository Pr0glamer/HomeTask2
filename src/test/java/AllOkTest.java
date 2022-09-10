import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllOkTest {

    @Test
    void testEqualsSymmetry(){
        AllOk allok = new AllOk("Vasya");
        AllOk allok2 = new AllOk("Vasya");
        assertEquals(allok.equals(allok2), true);
    }

}
