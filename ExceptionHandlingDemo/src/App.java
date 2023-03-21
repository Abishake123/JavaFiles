import java.io.IOException;

import ExceptionHandling.ErrorHandling;

public class App {
    public static void main(String[] args) throws ArithmeticException, Exception  {

        // hbihi();
        // try{
            ErrorHandling errorHandling = new ErrorHandling();
            errorHandling.strFun();
        // }catch(Exception exception){
        //     System.out.println("Exception : "+ exception);
        // }
        
        
        // System.out.println("");/

    }

    public static void hbihi() throws IOException {

        throw new IOException();

    }
}
