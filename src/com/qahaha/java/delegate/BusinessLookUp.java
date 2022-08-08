package delegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equals("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
