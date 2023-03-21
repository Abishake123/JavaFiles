package Exceptions;

public class ExceptionHandling {

    public void error() {

        String s = null;

        try{
            System.out.println("String : " + s.charAt(5));
        }catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println(stringIndexOutOfBoundsException); 
        }catch(NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        }catch(Exception exception){
            System.out.println(exception);
        }finally{
            System.out.println("Finally..........");
        }
    }

    public void testException() throws ArithmeticException{

        throw new ArithmeticException("Dont pass float value");
    }

}
