package Model;

public class Tugas1OOP {
    public static void main(String[] args){
        ProdukOOP produkSatu = new ProdukOOP("coffee", "Kopi Asli", 1000, 10);
        ProdukOOP produkDua = new ProdukOOP("","", 0, 0);
        ProdukOOP produkTiga = new ProdukOOP("", "", 0, 0);

        produkSatu.setName("coffee");
        produkSatu.setDescription("this is coffee");
        produkSatu.setPrice(15000);
        produkSatu.setPiece(10);

        produkDua.setName("milk");
        produkDua.setDescription("this is fresh milk");
        produkDua.setPrice(25000);
        produkDua.setPiece(10);

        produkTiga.setName("apple juice");
        produkTiga.setDescription("this is juice");
        produkTiga.setPrice(18000);
        produkTiga.setPiece(20);

        produkSatu.getInfo();
        produkDua.getInfo();
        produkTiga.getInfo();
    }
}
