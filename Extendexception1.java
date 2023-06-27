/* class InvalidUserNameException extends Exception{
   
    InvalidUserNameException(String msg){
        super(str);
        
    }
}
// throw ---> used to throw the Exception 
//throws ---> used to declare the exception
public class Main
{
    public void validate(String username) throws InvalidUserNameException {  //checked Exception 
        
        if(username.length()<= 10 && username.length()>=4){
            System.out.println("Valid user name length");
        }
        else{
            throw new InvalidUserNameException("Invalid length");
        }
        char[] arr=username.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                count++;
            }
        }
        if(count>=1){
             System.out.println("Valid user name contains capital letter");
        }
        else{
            throw new InvalidUserNameException("No capital letters");
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
 