import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "addresses")
public class Addresses {
    @XmlElement(name = "country")
    private List<Country> countries = new ArrayList<>();


    public Addresses() {
    }

    public Addresses(List<Country> countries) {
        this.countries = countries;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "cities=" + countries +
                '}';
    }
}
