package BusinessLayer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionTest {

    @Test
    void testGetPrice() {
        Excursion ex1 = new Excursion(8,200);
        assertEquals(1600,ex1.getPrice());
        Excursion ex2 = new Excursion(0, 0);
        assertEquals(0,ex2.getPrice());
    }
}