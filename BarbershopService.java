public class BarbershopService {
    private String serviceDescription;
    private double price;

    //stores the data
    public void setServiceDescription(String service) {
        serviceDescription = service;
    }

    public void setPrice(double servicePrice) {
        price = servicePrice;
    }

    //returns (or displays) the data
    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getPrice() {
        return price;
    }
}