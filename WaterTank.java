public abstract class WaterTank {
    protected int capacity;
    protected int currentLevel;

    public WaterTank(int capacity) {
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    public abstract void fillTank(int liters);
    public abstract void useWater(int liters);
    public abstract String checkStatus();
}
