public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2-3. ООП, часть 2. Интерфейсы и полиморфизм");
        System.out.println();

        Vehicle car1 = new Car("Car1");
        Vehicle car2 = new Car("Car2");

        Vehicle truck1 = new Truck("Truck1");
        Vehicle truck2 = new Truck("Truck2");

        Vehicle bicycle1 = new Bicycle("Bicycle1");
        Vehicle bicycle2 = new Bicycle("Bicycle2");

        ServiceStation station = new ServiceStation();

        station.check(car1);
        station.check(car2);

        station.check(truck1);
        station.check(truck2);

        station.check(bicycle1);
        station.check(bicycle2);
    }

}