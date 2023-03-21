import java.util.ArrayList;
import java.util.List;

import Encapsulation.Encapsulation;

public class App {
    public static void main(String[] args) throws Exception {

        List<Encapsulation> encapsulationList = new ArrayList<>();

        Encapsulation encapsulation;

        encapsulation = new Encapsulation();

        encapsulation.setsNo(12);
        encapsulation.setFirstName("karthik");
        encapsulation.setLastName("swaminathan");
        // System.out.println(encapsulation);
        encapsulationList.add(encapsulation);
        
        encapsulation = new Encapsulation();

        encapsulation.setsNo(13);
        encapsulation.setFirstName("Arun");
        encapsulation.setLastName("Vijay");
        // System.out.println(encapsulation);
        encapsulationList.add(encapsulation);

        encapsulation = new Encapsulation();

        encapsulation.setsNo(14);
        encapsulation.setFirstName("Surya");
        encapsulation.setLastName("Prakash");
        // System.out.println(encapsulation);
        encapsulationList.add(encapsulation);

        System.out.println("===================================================");

        System.out.println(encapsulationList);

        System.out.println("Encapsulation Access : "+ encapsulationList.get(0).getFirstName());

    }
}
