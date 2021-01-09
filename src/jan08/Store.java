package jan08;

import java.util.Objects;

public class Store {
    private String name;
    private Integer countOfDepartments;
    private Boolean isOpen;

    public Store(String name, Integer countOfDepartments, Boolean isOpen) {
        this.name = name;
        this.countOfDepartments = countOfDepartments;
        this.isOpen = isOpen;
    }

    public Store(String name, Integer countOfDepartments) {
        this.name = name;
        this.countOfDepartments = countOfDepartments;
    }

    public Store() {
        this.name = "Walmart";
        this.countOfDepartments = 25;
        this.isOpen = true;
    }
    public Integer increseCountOfDepartments(Integer addDepartments){
        Integer newCountOfDepartments = countOfDepartments + addDepartments;
        countOfDepartments = newCountOfDepartments;
        return newCountOfDepartments;
    }
    public String storeInfo(){
        if (isOpen && countOfDepartments>=10){
            return "Store open and big";
        } else if (!isOpen && countOfDepartments>=10){
            return "Store is close and big";
        } else if (isOpen && countOfDepartments<10){
            return "Store is open and small";
        } else {
            return "Store is close and small";
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountOfDepartments() {
        return countOfDepartments;
    }

    public void setCountOfDepartments(Integer countOfDepartments) {
        this.countOfDepartments = countOfDepartments;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(name, store.name) && Objects.equals(countOfDepartments, store.countOfDepartments) && Objects.equals(isOpen, store.isOpen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfDepartments, isOpen);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", countOfDepartments=" + countOfDepartments +
                ", isOpen=" + isOpen +
                '}';
    }
}
