package Model;

public class ProdukOOP {
    private String name;
    private String description;
    private int price;
    private int piece;


    public ProdukOOP(String name, String description, int price, int piece) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public void getInfo() {
        System.out.println("=======");
        System.out.println("INFO PRODUK");
        System.out.println("nama produk : " + this.name);
        System.out.println("deskripsi : " + this.description);
        System.out.println("harga : " + this.price);
        System.out.println("jumlah stok : " + this.price);
        System.out.println("=======");
    }
}
