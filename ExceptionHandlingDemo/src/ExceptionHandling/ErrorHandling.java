package ExceptionHandling;

import java.io.IOException;

public class ErrorHandling {

    public void strFun() throws ArithmeticException,Exception {

        throw new ArithmeticException();
        // System.out.println("Hello");

        // String s = null;

        // try{
        //     System.out.println(s.length());
        // }catch(NullPointerException exception){
        //     System.out.println("Please dont let the String as NULL.");

        // }catch(Exception exception){
        //     System.out.println("Something went Wrong!!");
        // }finally{
        //     System.out.println("Finally Completed......");
        // }
       

        // System.out.println("Process Completed Successfully");

        // try {
        // throw new IOException();
        // } catch (ArithmeticException e) {

        // e.printStackTrace();
        // }

        // try{
        // System.out.println("Result : "+ (x/y));
        // String s = null;
        // System.out.println(s.length());

        // }catch(ArithmeticException exception){
        // System.out.println("Exception Occured : "+ exception);
        // }catch(NullPointerException nullPointerException){
        // System.out.println("Exception occured : "+nullPointerException);
        // }finally{
        // System.out.println("I am finally..................");
        // }

    }

}