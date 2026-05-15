public class Main {
    public static void main(String args[]) {
        Produk p1 = new Elektronik("Samsung", 100000, 5, 3);
        Produk p2 = new Makanan("Bakso", 1000, 5, 3);
        Kasir kasir = new Kasir("Doni");

        p1.tampilInfo();
        kasir.tampilkIdentitas();
        kasir.prosesBelanja(p1,3);

        System.out.println();
        System.out.println();
        p2.tampilInfo();
        kasir.tampilkIdentitas();
        kasir.prosesBelanja(p2, 11);


    }
}