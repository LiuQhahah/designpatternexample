package builder;

import org.junit.Test;

public class ConstructionEngineerTest {
    @Test
    private void testConstructHouse() {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer constructionEngineer = new ConstructionEngineer(concreteHouseBuilder);
        House house = constructionEngineer.constructHouse();
        System.out.println(house.toString());
        HouseBuilder prefabricateHouseBuilder = new PrefabricateHouseBuilder();
        ConstructionEngineer constructionEngineer1 = new ConstructionEngineer(prefabricateHouseBuilder);
        House house1 = constructionEngineer1.constructHouse();
        System.out.println("House is :" + house1);


    }
}
