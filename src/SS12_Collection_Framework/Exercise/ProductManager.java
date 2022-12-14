package SS12_Collection_Framework.Exercise;

import java.util.*;

public class ProductManager {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Eraser", 20));
        products.add(new Product(2, "Book", 30));
        products.add(new Product(3, "Pencil", 25));
        products.add(new Product(4, "Book", 40));
        productManager.display(products);
        productManager.add(products);
        productManager.edit(products);
        productManager.remove(products);
        productManager.find(products);
        productManager.sortAscending(products);
        productManager.sortDescending(products);
    }

    public void add(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Add new product -----");
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Product's name: ");
        String name = sc.nextLine();
        System.out.println("Enter Product's cost: ");
        int cost = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, cost);
        products.add(product);
        System.out.println("----- List products after add new product ------");
        display(products);
    }

    public void edit(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Edit product -----");
        System.out.println("Enter the product ID you want to edit: ");
        int temp = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIdProduct() == temp) {
                check = true;
                System.out.println("Enter new name product:");
                String name = sc.nextLine();
                products.get(i).setNameProduct(name);

                System.out.println("Enter new cost product:");
                int cost = Integer.parseInt(sc.nextLine());
                products.get(i).setCostProduct(cost);

                System.out.println("----- List products after edit product ------");
                display(products);
            }
        }

        if (!check) {
            System.out.println("ID not found");
        }
    }

    public void remove(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Delete product -----");
        System.out.println("Enter the product ID you want to remove: ");
        int temp = Integer.parseInt(sc.nextLine());
        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getIdProduct() == temp) {
                check = true;
                products.remove(i);
                System.out.println("----- List products after remove product ------");
                display(products);
                break;
            }
        }

        if (!check) {
            System.out.println("ID not found");
        }
    }

    public void find(List<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Find product -----");
        System.out.println("Enter the product name you want to find: ");
        String temp = sc.nextLine();
        boolean check = false;
        boolean printed = true;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().equals(temp)) {
                check = true;
                if (printed) {
                    System.out.println("The product you are looking for is:"); //print this line 1 time
                    printed = false;
                }
                products.get(i).displayProduct();
            }
        }
        if (!check) {
            System.out.println("Product not found");
        }
    }

    public void sortAscending(List<Product> products) {
        System.out.println("----- Sort product by cost ascending -----");
        // use comparable: execute in class Product
        Collections.sort(products);
        display(products);
    }

    public void sortDescending(List<Product> products) {
        System.out.println("----- Sort product by cost descending -----");
        // use comparator: create new class CostComparator -> new object
        CostComparator costComparator = new CostComparator();
        products.sort(costComparator);
        // Collections.reverse(products); // use comparable: reverse >< sort
        display(products);
    }

    public void display(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).displayProduct();
        }
    }
}
