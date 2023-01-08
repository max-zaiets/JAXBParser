import javax.xml.bind.annotation.*;

@XmlType(propOrder = {"name"})
public class City {
    @XmlValue
    private String name;

    @XmlAttribute (name = "size")
    private String size;

    public City() {
    }

    public City(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
