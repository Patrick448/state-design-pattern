import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaidOrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("123");
        order.pay();
    }

    @Test
    void deveRetornarReembolsado() {
        order.refund();
        assertEquals("StateRefunded", order.getState().toString());
    }

    @Test
    void deveRetornarTransito() {
        order.transit();
        assertEquals("StateTransit", order.getState().toString());
    }

    @Test
    void naoDeveRetornarRegistrado() {
        assertFalse(order.file());
    }

    @Test
    void naoDeveRetornarCancelado() {
        assertFalse(order.cancel());
    }

    @Test
    void naoDeveRetornarEntregue() {
        assertFalse(order.deliver());
    }

    @Test
    void naoDeveRetornarFinalizado() {
        assertFalse(order.finish());
    }


}