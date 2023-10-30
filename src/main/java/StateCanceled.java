public class StateCanceled extends OrderState{

    private static StateCanceled instance = new StateCanceled();

    public static StateCanceled getInstance() {
        return instance;
    }

    private StateCanceled() {
    }

    public boolean finish(Order order) {
        order.setState(StateFinished.getInstance());
        return true;
    }

}
