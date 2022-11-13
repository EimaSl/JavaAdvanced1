package lesson13.teamWork;

public class Product {


    private static final String shopName = "Maxima";
    private int id;
    private String name;
    private double quantity;
    private double price;
    private String origin;

    public Product(int id, String name, double quantity, double price, String origin) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.origin = origin;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Can't be negative");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            System.out.println("Name is empty or not capital");
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (quantity > 0 && quantity < 10) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cant be 0 or bigger than 10 ");
        }
    }

    public double getPrice() {
            return price;
    }

    public void setPrice(double price) {
        if (price > 0 && price <=1000) {
            this.price = price;
        }else {
            System.out.println("can't be negative");
        }
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Product{" +
                "shopName='" + shopName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}';
    }
}
