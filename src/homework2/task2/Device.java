package homework2.task2;

public class Device {
    String name;
    int price;
    String origin;
    String type;
    String critical;

    public Device(String name, int price, String origin, String type, String critical) {
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.type = type;
        this.critical = critical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                ", critical='" + critical + '\'' +
                '}';
    }
}
