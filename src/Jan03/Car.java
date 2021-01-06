package Jan03;

public class Car {
    private  int carId=0;
    private String carBrand;
    private String color;
    private int placesAmount;
    private int carMileage;

    public Car(){

    }
    public Car(int carId){

    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlacesAmount() {
        return placesAmount;
    }

    public void setPlacesAmount(int placesAmount) {
        this.placesAmount = placesAmount;
    }
}
