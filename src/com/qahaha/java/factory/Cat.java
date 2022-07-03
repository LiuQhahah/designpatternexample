package factory;

public class Cat extends Pet {


    @Override
    void showCreateInfo(String name, int age) {
        System.out.println("the type is : CAT, my name is :" + name + "; my age is : " + age );
    }
}
