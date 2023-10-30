import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void deveRetornarRegistrado() {
        Order order = new Order("123");
        assertEquals("StateFiled", order.getState().toString());
    }


}