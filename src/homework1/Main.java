package homework1;

public class Main {

    public static void main(String[] args) {
        Store grosseryStore = new Store();
        Store clothesStore = new Store("TJ",12,true);
        Store drugStore = new Store("Walgreen",1);
        drugStore.setOpen(false);

        Store stores [] = new Store[3];
        stores [0] = grosseryStore;
        stores [1] = drugStore;
        stores [2] = clothesStore;
        Store.printArrayStoreInfo(stores);
        Store.printSortedArraySortInfo(stores);


        System.out.println(drugStore.getName());


        Integer a = clothesStore.increseCountOfDepartments(5);
        System.out.println(a);
        System.out.println(grosseryStore.storeInfo());
        System.out.println(clothesStore.storeInfo());
        System.out.println(drugStore.storeInfo());

        System.out.println(clothesStore.isStoreOpen());
        System.out.println(drugStore.defineStoreSize());
        System.out.println(drugStore.getCountOfDepartments());
        drugStore.makeStoreBig();
        System.out.println(drugStore.getCountOfDepartments());
    }
}
