public class Main {
    public static void main(String[] args) {
        final String path = "D:\\IntellijProjects\\JAXBParser\\src\\main\\java\\addresses.xml";

        Addresses addresses = new Addresses();
        addresses.addCountry(new Country(new City("Kyiv", "big"), "Novoaleksandrivska", 12));
        addresses.addCountry(new Country(new City("Dnipro", "big"), "Mayska", 28));
        JAXBWorker.convertObjectToXml(addresses, path);
    }
}
