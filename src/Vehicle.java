abstract class Vehicle implements VehicleService {

    private String modelName = "";

    private int wheelsCount;

    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.wheelsCount = 0;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public abstract void service();

}