package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class ToyBusiness {
    private ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return toyFactory.produceToy(type);
    }
    
    /**
     switch (type){
            case("car"): 
                AmericanCarToy car = new AmericanCarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case("helicopter"):
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default: 
                return null;
        }
     */
}
