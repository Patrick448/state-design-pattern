public class StateDelivered extends OrderState{

    private static StateDelivered instance = new StateDelivered();

    public static StateDelivered getInstance() {
        return instance;
    }

    private StateDelivered() {
    }

    public boolean finish(Order order) {
        order.setState(StateFinished.getInstance());
        return true;
    }
}
