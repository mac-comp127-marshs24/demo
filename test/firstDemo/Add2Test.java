package firstDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class Add2Test {

    @Test
    public void addTwoTest () {
        assertEquals(2, Add2.addTwo(0));
        assertEquals(1, Add2.addTwo(-1));
    }

}
