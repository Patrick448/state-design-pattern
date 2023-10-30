import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiledOrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("123");
    }

    @Test
    void deveRetornarRegistrado() {
        assertEquals("StateFiled", order.getState().toString());
    }

    @Test
    void deveRetornarPago() {
        order.pay();
        assertEquals("StatePaid", order.getState().toString());
    }

    @Test
    void deveRetornarCancelado() {
        order.cancel();
        assertEquals("StateCanceled", order.getState().toString());
    }

    @Test
    void naoDeveRetornarEntregue() {
        assertFalse(order.deliver());
    }

    @Test
    void naoDeveRetornarTransito() {
        assertFalse(order.transit());
    }

    @Test
    void naoDeveRetornarFinalizado() {
        assertFalse(order.finish());
    }

    @Test
    void naoDeveRetornarReembolsado() {
        assertFalse(order.refund());
    }





}