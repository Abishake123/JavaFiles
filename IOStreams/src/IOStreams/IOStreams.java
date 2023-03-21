package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreams {


    public void fileReadWriteMethod() throws IOException{

            System.out.println("File is operated now ...");
            
            FileOutputStream fout = new FileOutputStream("C:\\Users\\abish\\OneDrive\\Desktop\\test.txt");

            String para = "Welcome to the Morninig Seesion .....";

            byte b[] = para.getBytes();

            fout.write(b);

            fout.close();

            System.out.println("File has Updated Successfully...");

            FileInputStream fin = new FileInputStream("C:\\Users\\abish\\OneDrive\\Desktop\\test.txt");

            byte fileRead[] = fin.readAllBytes();

            for(byte tmp : fileRead){
                System.out.print((char) tmp);
            }

            // System.out.println("Check whats on the file : " + fileRead);



    }

    
    
}
