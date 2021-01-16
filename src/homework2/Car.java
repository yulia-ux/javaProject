package homework2;

import java.util.Objects;

public class Car implements Moveble{
   protected String name;
   protected String color;
   protected Boolean isRunning;
   protected CarBrand carBrand;

    public Car(String name, String color, Boolean isRunning, CarBrand carBrand) {
        this.name = name;
        this.color = color;
        this.isRunning = isRunning;
        this.carBrand = carBrand;
    }

    @Override
    public void move() {
        System.out.println("The car is running");
        isRunning = true;
    }

    public void stop(){
        System.out.println("The car is stoped");
        isRunning = false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getRunning() {
        return isRunning;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(color, car.color) && Objects.equals(isRunning, car.isRunning) && carBrand == car.carBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, isRunning, carBrand);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", isRunning=").append(isRunning);
        sb.append(", carBrand=").append(carBrand);
        sb.append('}');
        return sb.toString();
    }
}
