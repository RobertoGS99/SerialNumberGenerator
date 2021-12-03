/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.Scanner;
import toys.Car;
import toys.SerialNumberGenerator;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
        while(true){
            System.out.println("Introduce command ('exit for exit')");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            
            if(nextLine.equals("exit")){
                break;
            }else if(nextLine.equals("car")){
                Car car = new Car(serialNumberGenerator.next());
                car.pack();
                car.label();
            }else if(nextLine.equals("helicopter")){
                Car car = new Car(serialNumberGenerator.next());
                car.pack();
                car.label();
            }else {
                System.out.println("Command unknown");
            }
        }
        System.out.println("Client aplication finalized");
    }
}
