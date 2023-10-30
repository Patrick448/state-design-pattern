public class StateFiled extends OrderState{

    private static StateFiled instance = new StateFiled();

    public static StateFiled getInstance() {
        return instance;
    }

    private StateFiled() {
    }

    public boolean cancel(Order order) {
        order.setState(StateCanceled.getInstance());
        return true;
    }

    public boolean pay(Order order) {
        order.setState(StatePaid.getInstance());
        return true;
    }

}
