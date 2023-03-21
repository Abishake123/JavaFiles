package Encapsulation;

public class Encapsulation{

    private Integer id;

    private String firstName;

    private String lastName;

    private Address address;


    
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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




    public Address getAddress() {
        return address;
    }




    public void setAddress(Address address) {
        this.address = address;
    }




    @Override
    public String toString() {
        return "Encapsulation [address=" + address + ", firstName=" + firstName + ", id=" + id + ", lastName="
                + lastName + "]";
    }



}


