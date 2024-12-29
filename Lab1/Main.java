import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Milk", "123456789", "CompanyA", 1.50, 7, 50));
        products.add(new Product("Bread", "987654321", "CompanyB", 0.80, 3, 100));
        products.add(new Product("Milk", "111222333", "CompanyC", 1.20, 5, 30));
        products.add(new Product("Cheese", "444555666", "CompanyD", 5.00, 20, 10));
        products.add(new Product("Butter", "777888999", "CompanyE", 3.50, 15, 25));

        ProductManager manager = new ProductManager(products);

        manager.printProductsByName("Milk");

        manager.printProductsByNameAndPrice("Milk", 1.30);

        manager.printProductsByShelfLife(10);
    }
}