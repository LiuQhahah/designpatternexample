package factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();
        Pet dog = petFactory.newPet("DOG");
        Pet cat = petFactory.newPet("CAT");
        dog.showCreateInfo("dog",11);
        cat.showCreateInfo("cat",6);

    }
}
