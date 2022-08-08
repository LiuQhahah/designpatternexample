package delegate;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("do JMSService");
    }
}
