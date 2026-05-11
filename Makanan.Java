public class Makanan extands Produk{
    private String expired;

    publid Makanan(String nama, double harga, int stok, String expired){
        super(nama, harga, stok);
        this.expired = expired;
    }
    @Override
    public double hitungtotalBayar(int jumlah){
        return hitungtotalHarga(jumlah) * 0,5;
    }
    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("expired: " + expired);
    }
}
