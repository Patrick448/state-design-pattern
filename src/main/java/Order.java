public class Order {
    private String code;
    private OrderState state;

    public Order(String code) {
        this.code = code;
        this.state = StateFiled.getInstance();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public boolean file(){
        return state.file(this);
    }

    public boolean cancel(){
        return state.cancel(this);
    }

    public boolean pay(){
        return state.pay(this);
    }

    public boolean refund(){
        return state.refund(this);
    }

    public boolean deliver(){
        return state.deliver(this);
    }

    public boolean transit(){
        return state.transit(this);
    }

    public boolean finish(){
        return state.finish(this);
    }


}
