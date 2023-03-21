public class User {

    public User(){

    }


    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User(String userName,String password) {
        this.password = password;
        this.userName = userName;
    }

    // public User(String userName,String address) {
    //     this.address = address;
    //     this.userName = userName;
    // }


    public Integer id;
    
    public String userName;

    public String password;

    public String address;

    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
    }

    
}
