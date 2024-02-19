public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName);
        super.setWheelsCount(4);
    }

    @Override
    public void service() {
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");
    }

}