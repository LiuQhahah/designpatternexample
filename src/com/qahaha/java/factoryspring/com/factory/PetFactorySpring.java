package factory;

@Component
public class PetFactorySpring {
    public PetSpring createPet(String animalType){
        switch (animalType.toLowerCase()){
            case "dog":
                return new DogSpring();
            case "cat":
                return new CatSpring();
            default:
                throw new UnsupportedOperationException("unknown animalType");
        }
    }
}
