public class HomeTank extends WaterTank {
    public HomeTank() {
        super(500); // Home tank capacity = 500 liters
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
