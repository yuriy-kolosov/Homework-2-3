abstract class Vehicle {

    private String modelName;

    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
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

    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }

    }
}