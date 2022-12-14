package SS17_IO_Binary_File_and_Serialization.Exercise;

public class Product {
    private int id;
    private String name;
    private String company;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String company, double price, String description) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
