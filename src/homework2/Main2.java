package homework2;

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("X5", "Silver",false, CarBrand.BMW);
        car1.move();
        car1.stop();

        Truck truck1 = new Truck("250","black", true,CarBrand.DODGE,true);
        truck1.move();
        truck1.stop();
        truck1.load();
        truck1.upload();

    }
}
