import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RefundedOrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("123");
        order.pay();
        order.refund();
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
    void naoDeveRetornarCancelado() {
        assertFalse(order.cancel());
    }


    @Test
    void naoDeveRetornarTransito() {
        assertFalse(order.transit());
    }


    @Test
    void naoDeveRetornarRegistrado() {
        assertFalse(order.file());
    }


    @Test
    void naoDeveRetornarEntregue() {
        assertFalse(order.deliver());
    }



}