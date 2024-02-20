public class Car extends Vehicle {

    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Проверяем двигатель");
    }

}