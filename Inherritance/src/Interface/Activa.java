package Interface;

public class Activa implements Bike, Honda {

    public void fuelConsumption() {
        System.out.println("Less fuel Consumption");
    }

    @Override
    public void horn() {
        System.out.println("small horn");

    }

    @Override
    public void kickStart() {
        System.out.println("self start");
    }

    @Override
    public void brake() {
        System.out.println("Normal brakes");
    }

    @Override
    public void headLight() {
        System.out.println("Normal bulb");
    }

    @Override
    public void hondaLogo() {
        System.out.println("...HONDA...");
    }

}
