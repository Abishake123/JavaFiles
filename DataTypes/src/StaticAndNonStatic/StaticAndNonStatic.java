package StaticAndNonStatic;

public class StaticAndNonStatic {

    public void getUserDetails(){

        User user1 = new User();


        user1.firstName = "Abishake";
        user1.lastName = "Bhosley";
        user1.age = 22;
        // user1.language = "Tamil";

        System.out.println("User Obj : " + user1);

        User user2 = new User();


        user2.firstName = "Adithya";
        user2.lastName = "Tharun";
        user2.age = 20;
        // user2.language = "Tamil";

        System.out.println("User Obj : " + user2);

        User user3 = new User();


        user3.firstName = "Shalini";
        user3.lastName = "Sundar";
        user3.age = 21;
        // user3.language = "Tamil";

        System.out.println("User Obj : " + user3);



    }

    

}
