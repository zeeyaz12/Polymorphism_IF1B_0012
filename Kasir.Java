public class Kasir{
    private String nama;

    public Kasir(String nama){
        this.nama = nama;
    }

    public void tampilkIdentitas(){
        System.out.println("=== TOKO GARUDA ===");
        System.out.println("Nama Kasir: " + nama);
    }

    public void prosesBelanja(Produk p, int jmlhBeli){
        if(p.getStok() < jmlhBeli){
            System.out.println("Out of Stock");
        }else{
            double hargaAkhir = p.hitungHargaAkhir(jmlhBeli);
            System.out.println("Harga AKhir: " + hargaAkhir);

            p.setStok(jmlhBeli);
        }

        System.out.println("Stok saat ini: " + p.getStok());
    }
}