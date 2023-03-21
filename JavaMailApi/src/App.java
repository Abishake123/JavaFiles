import java.util.HashMap;
import java.util.Map;

import ExecutorService.ExecutorServiceTest;
import SimpleMail.SimpleMail;
import SimpleMail.SimpleMailTest;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleMail simpleMail = new SimpleMail();

        simpleMail.sendEmail("meenajanakiraman8083@gmail.com");

        // SimpleMailTest sendPlainTextEmail = new SimpleMailTest();

        // sendPlainTextEmail.sendPlainTextEmail("smtp.gmail.com", "573",
        // "abishakebabu123@gmail.com", "jfroesmpndcmiwtf",
        // "5001abishakebabu@gmail.com",
        // "First Mail", "Hi All, \n How are you Doing?");

        // ExecutorServiceTest executorServiceTest = new ExecutorServiceTest();

        // executorServiceTest.threadController();

        // String s1 = new String("Rahul");
        // String s2 = new String("Rahul");

        String s1 = "Rahul";
        String s2 = "Rahul";

        if (s1.equals(s2)) {
            System.out.println("Strings are Equal ...");
        } else {
            System.out.println("Not Equal");
        }

    }
}
