import java.util.Objects;

public class Product {
    private static int nextId = 0; 
    private int id;
    private String name;
    private String upc;
    private String manufacturer;
    private double price;
    private int shelfLife;
    private int quantity;    

    public Product(String name, String upc, String manufacturer, double price, int shelfLife, int quantity) {
        this.id = nextId++; 
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", upc=" + upc + ", manufacturer=" + manufacturer
                + ", price=" + price + ", shelfLife=" + shelfLife + ", quantity=" + quantity + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return id == other.id && Objects.equals(name, other.name) && Objects.equals(upc, other.upc)
                && Objects.equals(manufacturer, other.manufacturer) && price == other.price
                && shelfLife == other.shelfLife && quantity == other.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, upc, manufacturer, price, shelfLife, quantity);
    }
}