package homework1.task3;

import java.util.List;

public class Root {
    private String name;
    private List<Country> country;

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Root{" +
                "country=" + country +
                '}';
    }
}
