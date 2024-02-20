public class Truck extends Vehicle {

    public Truck(String modelName) {
        super(modelName, 6);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

}