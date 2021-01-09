package jan08;

public class Main {
    public static void main(String[] args) {
        Store grosseryStore = new Store();
        Store clothesStore = new Store("TJ",12,false);
        Store drugStore = new Store("Walgreen",2);
        drugStore.setOpen(false);
        System.out.println(grosseryStore);
        System.out.println(clothesStore);
        System.out.println(drugStore);
        System.out.println(drugStore.getName());


        Integer a = clothesStore.increseCountOfDepartments(5);
        System.out.println(a);
        System.out.println(grosseryStore.storeInfo());
        System.out.println(clothesStore.storeInfo());
        System.out.println(drugStore.storeInfo());
    }
}
