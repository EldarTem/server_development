import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    
    public void printProductsByName(String name) {
        System.out.println("Products with name: " + name);
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
            }
        }
    }

    public void printProductsByNameAndPrice(String name, double maxPrice) {
        System.out.println("Products with name: " + name + " and price less than or equal to " + maxPrice);
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name) && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }

    public void printProductsByShelfLife(int shelfLife) {
        System.out.println("Products with shelf life greater than " + shelfLife + " days");
        for (Product product : products) {
            if (product.getShelfLife() > shelfLife) {
                System.out.println(product);
            }
        }
    }
}