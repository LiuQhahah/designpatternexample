package factory;

public class DogSpring implements PetSpring{
    private String name;
    private boolean hungry;

    public DogSpring() {
        super();
        this.hungry = true;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "DOG";
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
