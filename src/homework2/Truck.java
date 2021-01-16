package homework2;

public class Truck extends Car {

    private Boolean isEmpty;

    public Truck(String name, String color, Boolean isRunning, CarBrand carBrand, Boolean isEmpty) {
        super(name, color, isRunning, carBrand);
        this.isEmpty = isEmpty;
    }

    @Override
    public void move() {
        System.out.println("Truck is running");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped");
        isRunning = false;
    }

    public void load(){
        System.out.println("Truck is load");
        isEmpty = false;
    }
    public void upload(){
        System.out.println("Truck is upload");
        isEmpty = true;
    }

}
