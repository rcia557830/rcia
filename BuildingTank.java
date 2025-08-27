public class BuildingTank extends WaterTank {
    public BuildingTank() {
        super(5000); // Building tank capacity = 5000 liters
    }

    @Override
    public void fillTank(int liters) {
        currentLevel += liters;
        if (currentLevel > capacity) {
            currentLevel = capacity;
        }
    }

    @Override
    public void useWater(int liters) {
        currentLevel -= liters;
        if (currentLevel < 0) {
            currentLevel = 0;
        }
    }

    @Override
    public String checkStatus() {
        if (currentLevel == 0) return "Empty";
        else if (currentLevel == capacity) return "Full";
        else return "In Use";
    }
}
