public class StateRefunded extends OrderState{

    private static StateRefunded instance = new StateRefunded();

    public static StateRefunded getInstance() {
        return instance;
    }

    private StateRefunded() {
    }

    public boolean finish(Order order) {
        order.setState(StateFinished.getInstance());
        return true;
    }


}
