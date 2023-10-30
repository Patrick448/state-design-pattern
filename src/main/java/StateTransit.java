public class StateTransit extends OrderState{

    private static StateTransit instance = new StateTransit();

    public static StateTransit getInstance() {
        return instance;
    }

    private StateTransit() {
    }

    public boolean deliver(Order order) {
        order.setState(StateDelivered.getInstance());
        return true;
    }

}
