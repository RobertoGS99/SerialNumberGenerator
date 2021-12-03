/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import business.ToyBusiness;
import factories.ToyFactory;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ToyFactory toyFactory = new AmericanToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness(toyFactory);
        while(true){
            System.out.println("Introduce command:                        ('exit for exit')");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            
            if(nextLine.equals("exit")){
                break;
            }else if(nextLine.equals("car")){
                toyBusiness.produceToy(nextLine);
            }else if(nextLine.equals("helicopter")){
                toyBusiness.produceToy(nextLine);
            }else {
                System.out.println("Command unknown");
            }
        }
        System.out.println("Client aplication finalized");
    }
}
