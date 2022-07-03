package factory;

public class PetFactory {
    public Pet newPet(String petType){
        switch (petType){
            case "CAT":
                return new Cat();
            case "DOG":
                return new Dog();
            default:
                return null;
        }
    }
}
