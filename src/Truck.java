public class Truck extends Vehicle{

    public Truck(String modelName) {
        super(modelName);
        super.setWheelsCount(6);
    }

    @Override
    public void service() {
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

}