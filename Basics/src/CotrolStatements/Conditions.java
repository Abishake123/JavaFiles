package CotrolStatements;

public class Conditions {

    public String checkTheAge(int num) {

        if (num == 0) {
            System.out.println("Value is  ..."+ num);
        } else if (num % 2 == 0) {
            System.out.println("Even ...");
        } else {
            System.out.println("Odd ...");
        }

        return "";

    }

}
