package homework1;

import java.util.Arrays;
import java.util.Objects;

public class Store implements Comparable<Store>{

    private final Integer sizeOfBigStore = 10;
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

    public String isStoreOpen() {
       return isOpen ? "Store is open" : "Store is close";
    }

    public String defineStoreSize() {
        switch (countOfDepartments){
            case 1: return "countOfDepartments = 1";
            case 2: return "countOfDepartments = 2";
            default: return "anotherCountOfDepartments";
        }
    }

    public String storeInfo(){
        if (isOpen && countOfDepartments>= sizeOfBigStore){
            return "Store open and big";
        } else if (!isOpen && countOfDepartments>= sizeOfBigStore){
            return "Store is close and big";
        } else if (isOpen && countOfDepartments< sizeOfBigStore){
            return "Store is open and small";
        } else {
            return "Store is close and small";
        }
    }

    public void makeStoreBig() {
        if (countOfDepartments < sizeOfBigStore) {
            while (!countOfDepartments.equals(sizeOfBigStore)) {
                countOfDepartments ++;
            }
        }
    }

    public static void printArrayStoreInfo (Store[] stores) {
        for (int i = 0; i<stores.length; i++) {
            System.out.println(stores[i]);
        }
    }

    public static void printSortedArraySortInfo (Store [] stores) {
        Arrays.sort(stores);
        for (Store store : stores) {
            System.out.println(store);
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

    @Override
    public int compareTo(Store o) {
        return Integer.compare(getCountOfDepartments(), o.getCountOfDepartments());
    }
}
