/* class InvalidUserNameException extends Exception{
    
}
// throw ---> used to throw the Exception 
//throws ---> used to declare the exception
public class Main
{
    public void validate(String username) throws InvalidUserNameException {  //checked Exception 
        
        if(username.length()<= 10 && username.length()>=4){
            System.out.println("Valid user name");
        }
        else{
            throw new InvalidUserNameException();
        }
    }
    public static void main(String[] args) {
        
           Main obj=new Main();
           
           try{
           obj.validate("madar");
           }catch(Exception e){
               System.out.println(e);
           }
    }
} */