import Interface2.Facino;
import Interface2.Ninja300;

public class App {
    public static void main(String[] args) throws Exception {
        Ninja300 ninja300 = new Ninja300();

        ninja300.fuelType();

        Facino facino = new Facino();

        facino.fuelType();
    }
}
