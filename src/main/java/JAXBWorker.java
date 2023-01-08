import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBWorker {
    public static Addresses fromXmlToObject(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Addresses) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void convertObjectToXml(Addresses addresses, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Addresses.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(addresses, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
