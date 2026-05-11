public class Elektroik extends Produk{
    private int garansi;
    private String merek;

    public Elektronik(String nama, double harga, int stok, String merek){
        super(nama, harga, stok);
        this.garansi = garansi;
        this.merek = merek;

    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("Garansi: " + garansi);
        System.out.println("Merek: " + merek);
    }
}