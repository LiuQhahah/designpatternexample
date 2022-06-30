package decorator2;

public class BaseBattercake  extends Battercake{

    @Override
    protected String getMsg() {
        return "jianping";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
