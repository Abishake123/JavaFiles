package Interface;

public class Rx100 implements Bike,Yamaha {



    public void fuelConsumption(){
        System.out.println("Over fuel Consumption");
    }

    @Override
    public void horn() {
        System.out.println("Car horn");
        
    }

    @Override
    public void kickStart() {
        System.out.println("NO Kick start ,Only Self");
        
    }

    @Override
    public void brake() {
        System.out.println("ABS");
        
    }

    @Override
    public void headLight() {
        System.out.println("Projector Lamp");
        
    }

    @Override
    public void yamahaLogo() {
        System.out.println("...YAMAHA...");
        
    }
    
}
