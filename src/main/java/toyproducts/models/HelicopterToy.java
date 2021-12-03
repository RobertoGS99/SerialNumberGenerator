package toyproducts.models;

import toyproducts.Toy;

public class HelicopterToy implements Toy {
    private final Integer serialNumber;
    private final String type = "Helicopter";
    
    public HelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is packed.\n");
    }
    
    public void label(){
        System.out.println("The " +type+ " with serial number "+serialNumber.toString()+" is labelled.\n");
    }
    
}
