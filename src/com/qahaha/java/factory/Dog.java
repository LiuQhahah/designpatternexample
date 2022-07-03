package factory;

public class Dog extends Pet {


    @Override
    void showCreateInfo(String name, int age) {
        System.out.println("the type is : DOG, my name is :" + name + "; my age is : " + age );
    }
}
