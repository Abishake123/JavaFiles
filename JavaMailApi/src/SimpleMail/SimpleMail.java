package SimpleMail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SimpleMail{

    public void sendEmail(String recepient) throws AddressException, MessagingException{

        System.out.println("Preparing to send Email : ");

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");


        String email = "abishakebabu123@gmail.com";
        String password = "gwmtgeyavjwwyyzm";


        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(email, password);
            }
        });
        

        // Session  session = Session.getDefaultInstance(properties);

        Message message =  new MimeMessage(session);

        message.setFrom(new InternetAddress(email));

        message.setRecipient(Message.RecipientType.TO, new InternetAddress("basekechup@gmail.com"));
        message.setRecipient(Message.RecipientType.CC, new InternetAddress("shobikarajeskanna@gmail.com"));
        // message.setRecipient(Message.RecipientType.BCC, new InternetAddress("jishnusaravanan6@gmail.com"));

        message.setSubject("REg : My first mail from java Api");

        message.setText("Hey there , \n This is my first Email.\n Check out the Email");

        Transport.send(message);

        System.out.println("Message Sent successfully...");


    }


}