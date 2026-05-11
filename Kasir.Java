public class Kasir{
    private String namaKasir;

    public Kasir(String namaKasir){
        this.namaKasir = namaKasir;
    }

    public void transaksi(Produk p, int jumlah){
        double hargaAkhir * 0.0;
        
        if (jumlah> p.getStok()){
            System.out.println("Stok tidak cukup");

        } else{
            hargaAkhir = p.hitungtotalBayar(jumlah);
            p.setStok(jumlah);
        }
        System.out.println("------- Toko Jaya -------");
        System.out.println("Nama Kasir:" + namaKasir);
        System.out.println("JUmlah Beli:" + jumlah);
        System.out.println("Total Harga: " + hargaAKhir);
        System.out.println("Sisa Stok: " + p.getStok());

    }
}