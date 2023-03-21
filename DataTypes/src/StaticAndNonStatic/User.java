package StaticAndNonStatic;

public class User {

    public String firstName;

    public String lastName;

    public Integer age;

    public static String language = "Tamil";

    @Override
    public String toString() {
        return "User {age=" + age + ", firstName=" + firstName + ", language=" + language + ", lastName=" + lastName
                + "}";
    }


    


    
    
}
