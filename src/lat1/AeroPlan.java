/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat1;

/**
 *
 * @author Pesek
 */
public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeroplan is Flaying");
    }
    public static void main(String[]args){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }

    @Override
    public void fuel() {
        AeroPlan fuel = new AeroPlan();
        fuel.function();
        fuel.walk();
    }
    
}
