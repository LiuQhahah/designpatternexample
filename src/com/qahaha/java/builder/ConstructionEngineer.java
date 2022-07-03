package builder;

import java.util.PrimitiveIterator;

public class ConstructionEngineer {
    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.furnishHouse();
        this.houseBuilder.paintHouse();
        return this.houseBuilder.getHouse();
    }
}
