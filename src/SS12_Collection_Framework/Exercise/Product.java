package SS12_Collection_Framework.Exercise;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int costProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, int costProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCostProduct() {
        return costProduct;
    }

    public void setCostProduct(int costProduct) {
        this.costProduct = costProduct;
    }
}
