package BusinessLayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HabitationTest {

    @Test
    void testGetPrice() {
        Habitation habit1 = new Habitation(2,150);
        assertEquals(300, habit1.getPrice());
    }
}