package visitor2;



public abstract class Visitor {
    public abstract void visit(XmlElement xe);
    public abstract void visit(JsonElement je);
}
