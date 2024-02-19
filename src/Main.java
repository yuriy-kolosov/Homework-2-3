public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2-3. ООП, часть 2. Интерфейсы и полиморфизм");
        System.out.println();

        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");

        Truck truck1 = new Truck("Truck1");
        Truck truck2 = new Truck("Truck2");

        Bicycle bicycle1 = new Bicycle("Bicycle1");
        Bicycle bicycle2 = new Bicycle("Bicycle2");

        ServiceStation station = new ServiceStation();

        station.check(car1);
        System.out.println();
        station.check(car2);
        System.out.println();
        station.check(truck1);
        System.out.println();
        station.check(truck2);
        System.out.println();
        station.check(bicycle1);
        System.out.println();
        station.check(bicycle2);

    }
}