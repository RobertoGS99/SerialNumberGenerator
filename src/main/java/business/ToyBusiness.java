package business;

import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public abstract class ToyBusiness {
    public SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
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
