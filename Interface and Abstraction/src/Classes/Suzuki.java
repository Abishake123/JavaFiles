package Classes;

import Abstraction.BikeAbstraction;

public class Suzuki extends BikeAbstraction{


    public void cost(){
        System.out.println("Cost : 15000 $");
    }

    public void displacement() {
        System.out.println("Dispalcement : 1300cc");
         
     }
 
     public void torque() {
         System.out.println("Torque : 42 N/m");
     }
 
     public void acceleration() {
         System.out.println("Acceleration : 0 - 100 in 0.3s");
         
     }

    

    
    
}
