@SuppressWarnings("unused")
public class JewelleryItem {
    
    private final String name;
    private final int productId;
    private double price;
    private final String material;
    private final double weight;
    private final String color;
    private final double kartage;
    private boolean isAvailable;

    JewelleryItem(String name, int productId, double price, String material, double weight, String color, double kartage, boolean isAvailable) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.material = material;
        this.weight = weight;
        this.color = color;
        this.kartage = kartage;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public double getKartage() {
        return kartage;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public void setAvailability(boolean available) {
        isAvailable = available;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



@SuppressWarnings("unused")
class Ring extends JewelleryItem{
    private final double size;
    private final String type;

    Ring(String name, int productId, double price, String material, double weight, String color, double kartage, boolean isAvailable, double size, String type) {
        super(name, productId, price, material, weight, color, kartage, isAvailable);
        this.size = size;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}

@SuppressWarnings("unused")
class Necklace extends JewelleryItem{
    private final double size;
    private final double height;

    Necklace(String name, int productId, double price, String material, double weight, String color, double kartage, boolean isAvailable, double size, double height) {
        super(name, productId, price, material, weight, color, kartage, isAvailable);
        this.size = size;
        this.height = height;
    }

    public double getSize() {
        return size;
    }

    public double getHeight() {
        return height;
    }
}

@SuppressWarnings("unused")
class Bangles extends JewelleryItem{
    private final double size;
    private final String width;

    Bangles(String name, int productId, double price, String material, double weight, String color, double kartage, boolean isAvailable, double size, String width) {
        super(name, productId, price, material, weight, color, kartage, isAvailable);
        this.size = size;
        this.width = width;
    }

    public double getSize() {
        return size;
    }

    public String getWidth() {
        return width;
    }
}
