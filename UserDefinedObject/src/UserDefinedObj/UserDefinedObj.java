package UserDefinedObj;

public class UserDefinedObj{

    private String userName;
    private Integer age;
    private String gender;
    private static String country = "India";


   



    public String getUserName() {
        return userName;
    }






    public void setUserName(String userName) {
        this.userName = userName;
    }






    public Integer getAge() {
        return age;
    }






    public void setAge(Integer age) {
        this.age = age;
    }






    public String getGender() {
        return gender;
    }






    public void setGender(String gender) {
        this.gender = gender;
    }






    public static String getCountry() {
        return country;
    }






    public static void setCountry(String country) {
        UserDefinedObj.country = country;
    }






    @Override
    public String toString() {
        return "UserDefinedObj [age=" + age + ", country=" + country + ", gender=" + gender + ", userName=" + userName
                + "]";
    }


   

    
    
}