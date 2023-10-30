import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DeliveredOrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("123");
        order.pay();
        order.transit();
        order.deliver();
    }

    @Test
    void deveRetornarFinalizado() {
        order.finish();
        assertEquals("StateFinished", order.getState().toString());
    }

    @Test
    void naoDeveRetornarPago() {
        assertFalse(order.pay());
    }

    @Test
    void naoDeveRetornarTransito() {
        assertFalse(order.transit());
    }

    @Test
    void naoDeveRetornarReembolsado() {
        assertFalse(order.refund());
    }

    @Test
    void naoDeveRetornarRegistrado() {
        assertFalse(order.file());
    }

    @Test
    void naoDeveRetornarCancelado() {
        assertFalse(order.cancel());
    }



}