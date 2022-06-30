package visitor;

public class ConcreteVisitorA extends Visitor{
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass() +" visitor by " + this.getClass());
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass() +" visitor by " + this.getClass());
    }
}
