package factory;

public class CatSpring implements PetSpring{
    private String name;
    private boolean hungry;

    @Override
    public void setName(String name) {
        this.name  = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "CAT";
    }

    @Override
    public boolean inHungry() {
        return this.hungry;
    }

    @Override
    public void feed() {
        this.hungry = false;
    }
}
