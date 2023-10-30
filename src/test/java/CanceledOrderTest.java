import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CanceledOrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("123");
        order.cancel();
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
    void naoDeveRetornarEntregue() {
        assertFalse(order.deliver());
    }



}