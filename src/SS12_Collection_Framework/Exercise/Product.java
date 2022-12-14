package SS12_Collection_Framework.Exercise;

public class Product implements Comparable<Product> {
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

    public void displayProduct(){
        System.out.printf("Id: %4d   | Name Product: %10s   | Cost Product: %10d",idProduct,nameProduct,costProduct);
        System.out.println();
    }

    @Override
    public int compareTo(Product o) {
        if (getCostProduct() > o.getCostProduct()) return 1;
        else if (getCostProduct() < o.getCostProduct()) return -1;
        else return 1;
    }
}
