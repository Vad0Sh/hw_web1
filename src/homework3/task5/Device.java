package homework3.task5;

import javax.xml.bind.annotation.XmlElement;

public class Device {
    int id;
    String name;
    int price;
    String origin;
    String type;
    String critical;

    public Device(int id, String name, int price, String origin, String type, String critical) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.type = type;
        this.critical = critical;
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
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    @XmlElement
    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }
    @XmlElement
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }
    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public String getCritical() {
        return critical;
    }
    @XmlElement
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