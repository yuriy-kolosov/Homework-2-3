public class Bicycle extends Vehicle {

    public Bicycle(String modelName) {
        super(modelName);
        super.setWheelsCount(2);
    }

    @Override
    public void service() {
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

}