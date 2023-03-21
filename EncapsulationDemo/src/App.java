import java.util.ArrayList;
import java.util.List;

import Encapsulation.Address;
import Encapsulation.Encapsulation;

public class App {
    public static void main(String[] args) throws Exception {

        Encapsulation encapsulation;

        List<Encapsulation> encapsulationList = new ArrayList<>();

        encapsulation = new Encapsulation();
        encapsulation.setId(2);
        encapsulation.setFirstName("Harry");
        encapsulation.setLastName("Kawn");

        Address address = new Address();
        address.setCountry("USA");
        address.setPinCode(9090);
        address.setState("georgia");
        address.setStreet("3rd cross street");
        
        encapsulation.setAddress(address);

        encapsulationList.add(encapsulation);

        encapsulation = new Encapsulation();

        encapsulation.setId(3);
        encapsulation.setFirstName("Dinsh");
        encapsulation.setLastName("Karthick");
        // encapsulation.setAddress("abc street");

        encapsulationList.add(encapsulation);

        System.out.println(encapsulationList);

    }
}
