package decorator2;

public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +" add one Sausage";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
    protected void doSomething(){}
}
