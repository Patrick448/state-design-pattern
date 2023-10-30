public abstract class OrderState {

    public String toString(){
        return this.getClass().getSimpleName();
    }

    public boolean pay(Order order) {
        return false;
    }

    public boolean refund(Order order) {
        return false;
    }

    public boolean file(Order order) {
        return false;
    }

    public boolean deliver(Order order) {
        return false;
    }

    public boolean cancel(Order order) {
        return false;
    }

    public boolean finish(Order order) {
        return false;
    }

    public boolean transit(Order order) {
        return false;
    }
}
