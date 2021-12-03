/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches;

import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

/**
 *
 * @author Admin
 */
public class AsianToyBusiness extends ToyBusiness {

    @Override
    public Toy createToy(String type) {
        switch (type){
            case("car"): 
                AsianCarToy car = new AsianCarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case("helicopter"):
                AsianHelicopterToy helicopter = new AsianHelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default: 
                return null;
        }
    }
    
}
