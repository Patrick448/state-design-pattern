import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinishedOrderTest {

    private Order order;

    @BeforeEach
    public void setUp() {
        order = new Order("123");
        order.pay();
        order.transit();
        order.deliver();
        order.finish();
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

    @Test
    void naoDeveRetornarEntregue() {
        assertFalse(order.deliver());
    }



}