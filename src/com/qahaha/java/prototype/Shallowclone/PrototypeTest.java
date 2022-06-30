package prototype.Shallowclone;

import java.util.ArrayList;

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("test");
        ArrayList horries = new ArrayList();
        concretePrototypeA.setHobbies(horries);

        Client client = new Client(concretePrototypeA);
        ConcretePrototypeA concretePrototypeAclone = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println("Age:" + concretePrototypeAclone.getAge() + ", name: " + concretePrototypeAclone.getName()
                + ", horries: " + concretePrototypeAclone.getHobbies());

        System.out.println(concretePrototypeA.getAge() == concretePrototypeAclone.getAge());

    }
}
