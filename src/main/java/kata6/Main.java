/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.Scanner;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;
import toys.ToyBusiness;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        while(true){
            System.out.println("Introduce command:                        ('exit for exit')");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            
            if(nextLine.equals("exit")){
                break;
            }else if(nextLine.equals("car")){
                toyBusiness.createToy(nextLine);
            }else if(nextLine.equals("helicopter")){
                toyBusiness.createToy(nextLine);
            }else {
                System.out.println("Command unknown");
            }
        }
        System.out.println("Client aplication finalized");
    }
}
