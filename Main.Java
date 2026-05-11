public class Main{

    public static void main(String[] args){
        Produk p = new Elektronik("Kulkas", 5000000, 5, "Polytron");
        Produk p2 = new Makanan("Roti", 5000, 50, "2026");
        Kasir k = new Kasir("Zia");

        p.tampilInfo();
        k.transaksi(p, 1);

        System.out.println();
        System.out.println();
        p2.tampilInfo();
        k.transaksi(p2, 10);
    }
}