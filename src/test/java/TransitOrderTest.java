import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TransitOrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("123");
        order.pay();
        order.transit();
    }


    @Test
    void deveRetornarEntregue() {
        order.deliver();
        assertEquals("StateDelivered", order.getState().toString());
    }

    @Test
    void naoDeveRetornarPago() {
        assertFalse(order.pay());
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

    @Test
    void naoDeveRetornarFinalizado() {
        assertFalse(order.finish());
    }


}