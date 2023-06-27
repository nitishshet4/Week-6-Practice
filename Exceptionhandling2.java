/* public class Main
{
    public static void main(String[] args) {
        // five keywords to handle Exception 
        //1. Try 
        //2. catch 
        //3. finally 
        
        //4. Throw 
        //5. Throws
    
        try{
           int[] arr=new int[5]; //jvm reads line by line and it also read from left right
           //arr[i]=15/0; //ArrayIndexOutOfBoundsException, ArithmeticException
           String str=null;
           System.out.println(str.length()); //NullPointerException
          
        }
        catch(ArithmeticException e){
            System.out.println(e);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            
        }
        catch(Exception e){
            System.out.println("Super class exception");
            
        }
        
        System.out.println("rest of code");
    }
} */