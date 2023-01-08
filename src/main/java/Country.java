import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"city", "street", "building"})
public class Country {
    private City city;
    private String street;
    private int building;

    public Country() {
    }

    public Country(City city, String street, int building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }
    @XmlElement(name = "city")
    public void setCity(City city) {
        this.city = city;
    }
    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }
    @XmlElement(name = "building")
    public void setBuilding(int building) {
        this.building = building;
    }

    public City getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return "Region{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                '}';
    }
}
