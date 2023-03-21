package Encapsulation;

public class Encapsulation {
    private Integer sNo;
    private String firstName;
    private String lastName;

    
    public Integer getsNo() {
        return sNo;
    }


    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Encapsulation [firstName=" + firstName + ", lastName=" + lastName + ", sNo=" + sNo + "]";
    }

}

