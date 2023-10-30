public class StateFinished extends OrderState{

    private static StateFinished instance = new StateFinished();

    public static StateFinished getInstance() {
        return instance;
    }

    private StateFinished() {
    }

}
