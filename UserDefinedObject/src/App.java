import java.util.ArrayList;
import java.util.List;

import UserDefinedObj.UserDefinedObj;

public class App {
    public static void main(String[] args) throws Exception {

        List<UserDefinedObj> userDefinedObjs = new ArrayList<>();

        UserDefinedObj userDefinedObj = new UserDefinedObj();

        userDefinedObj.setUserName("Abishake"); 
        userDefinedObj.setAge(22);
        userDefinedObj.setGender("Male");

        userDefinedObjs.add(userDefinedObj);

        userDefinedObj = new UserDefinedObj();

        userDefinedObj.setUserName("Meena"); 
        userDefinedObj.setAge(23);
        userDefinedObj.setGender("FeMale");

        userDefinedObjs.add(userDefinedObj);

        userDefinedObj = new UserDefinedObj();

        userDefinedObj.setUserName("Swomiya"); 
        userDefinedObj.setAge(24);
        userDefinedObj.setGender("FeMale");

        userDefinedObjs.add(userDefinedObj);

        System.out.println(userDefinedObjs);

    }
}
