package homework1.task3;

public class Country {
    private String name;
    private String capital;
    private String description;

    public Country(String name, String capital, String description) {
        this.name = name;
        this.capital = capital;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
