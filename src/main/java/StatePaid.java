public class StatePaid extends OrderState{

    private static StatePaid instance = new StatePaid();

    public static StatePaid getInstance() {
        return instance;
    }

    private StatePaid() {
    }

    public boolean refund(Order order) {
        order.setState(StateRefunded.getInstance());
        return true;
    }

    public boolean transit(Order order) {
        order.setState(StateTransit.getInstance());
        return true;
    }

}
